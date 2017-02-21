package net.t3kt.tctrl.schema.parser;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Range;
import net.t3kt.tctrl.schema.ParamOption;
import net.t3kt.tctrl.schema.ParamSpec;
import net.t3kt.tctrl.schema.ParamType;
import net.t3kt.tctrl.schema.VectorParamPartSpec;
import net.t3kt.tctrl.schema.impl.*;

import javax.json.JsonArray;
import javax.json.JsonObject;

class ParamParser<B extends CommonBuilders.ParamSpecBuilder> {

    static ParamSpec parseObject(JsonObject obj) {
        ParamParser<?> parser = fromObject(obj);
        return parser.parse(obj);
    }

    private static ParamParser<?> fromObject(JsonObject obj) {
        String key = ParserUtil.getRequiredString(obj, "key");
        String typeStr = ParserUtil.getRequiredString(obj, "type");
        ParamType type = ParamType.parseType(typeStr).orElse(null);

        if (type == null) {
            type = ParamType.OTHER;
        }
        switch (type) {
            case TRIGGER:
                return new ParamParser<>(ParamSpecImpl.builder(key, ParamType.TRIGGER));
            case BOOL:
                return new BoolParamParser(SingleValueParamSpecImpl.builder(key, ParamType.BOOL));
            case STRING:
            case MENU:
                return new StringParamParser(StringParamSpecImpl.builder(key, type));
            case INT:
                return new SingleNumberParamParser<>(INTEGER_HANDLER, SingleNumberParamSpecImpl.builder(key, ParamType.INT));
            case FLOAT:
                return new SingleNumberParamParser<>(FLOAT_HANDLER, SingleNumberParamSpecImpl.builder(key, ParamType.FLOAT));
            case IVEC:
                return new VectorParamParser<>(INTEGER_HANDLER, VectorParamSpecImpl.builder(key, ParamType.IVEC));
            case FVEC:
                return new VectorParamParser<>(FLOAT_HANDLER, VectorParamSpecImpl.builder(key, ParamType.FVEC));
            case OTHER:
            default:
                return new ParamParser<>(
                        ParamSpecImpl.builder(key, ParamType.OTHER)
                                .setOtherType(typeStr));
        }
    }

    protected final B builder;

    ParamParser(B builder) {
        this.builder = builder;
    }

    final ParamSpec parse(JsonObject obj) {
        readObject(obj);
        return builder.build();
    }

    protected void readObject(JsonObject obj) {
        ParserUtil.parseNodeCommonAttrs(builder, obj);
        builder.setGroup(obj.getString("group", null));
        builder.setStyle(obj.getString("style", null));
    }

    private static final class BoolParamParser extends ParamParser<SingleValueParamSpecImpl.Builder<Boolean>> {

        BoolParamParser(SingleValueParamSpecImpl.Builder<Boolean> builder) {
            super(builder);
        }

        @Override
        protected void readObject(JsonObject obj) {
            super.readObject(obj);
            builder.setDefaultValue(obj.getBoolean("default", false));
        }
    }

    private static final class StringParamParser extends ParamParser<StringParamSpecImpl.Builder> {

        StringParamParser(StringParamSpecImpl.Builder builder) {
            super(builder);
        }

        @Override
        protected void readObject(JsonObject obj) {
            super.readObject(obj);
            builder.setDefaultValue(obj.getString("default", null));
            if (obj.containsKey("options")) {
                JsonArray array = obj.getJsonArray("options");
                builder.setOptions(ImmutableList.copyOf(array.getValuesAs(StringParamParser::parseParamOption)));
            }
        }

        static ParamOption parseParamOption(JsonObject obj) {
            String key = ParserUtil.getRequiredString(obj, "key");
            String label = obj.getString("label", key);
            return ParamOption.create(key, label);
        }
    }

    private static final class VectorParamParser<T extends Comparable<T>> extends ParamParser<VectorParamSpecImpl.Builder<T>> {

        private final NumberHandler<T> handler;

        VectorParamParser(NumberHandler<T> handler, VectorParamSpecImpl.Builder<T> builder) {
            super(builder);
            this.handler = handler;
        }

        @Override
        protected void readObject(JsonObject obj) {
            super.readObject(obj);

            JsonArray partsArray = ParserUtil.getRequiredArray(obj, "parts");
            for (JsonObject partObj : partsArray.getValuesAs(JsonObject.class)) {
                builder.addPart(parsePart(partObj));
            }
        }

        private VectorParamPartSpec<T> parsePart(JsonObject obj) {
            String key = ParserUtil.getRequiredString(obj, "key");
            VectorParamPartSpecImpl.Builder<T> partBuilder = VectorParamPartSpecImpl.<T>builder()
                    .setKey(key);
            handler.readSpecObject(partBuilder, obj);
            return partBuilder.build();
        }
    }

    private abstract static class NumberHandler<T extends Comparable<T>> {
        abstract T getField(JsonObject obj, String key);
        abstract T getDefaultDefaultValue();
        abstract Range<T> getDefaultNormRange();

        void readSpecObject(CommonBuilders.SingleNumberSpecBuilder<T> builder, JsonObject obj) {

            T defaultVal = getField(obj, "default");
            if (defaultVal != null) {
                builder.setDefaultValue(defaultVal);
            } else {
                builder.setDefaultValue(getDefaultDefaultValue());
            }

            T minLimit = getField(obj, "minLimit");
            T maxLimit = getField(obj, "maxLimit");
            builder.setLimitRange(ParserUtil.makeRange(minLimit, maxLimit));

            T minNorm = getField(obj, "minNorm");
            T maxNorm = getField(obj, "maxNorm");
            Range<T> normRange = ParserUtil.makeRange(minNorm, maxNorm);
            if (normRange != null) {
                builder.setNormRange(normRange);
            } else {
                builder.setNormRange(getDefaultNormRange());
            }
        }
    }

    private static final NumberHandler<Integer> INTEGER_HANDLER =
            new NumberHandler<Integer>() {
                @Override
                Integer getField(JsonObject obj, String key) {
                    return ParserUtil.getNullableInt(obj, key);
                }

                @Override
                Integer getDefaultDefaultValue() {
                    return 0;
                }

                @Override
                Range<Integer> getDefaultNormRange() {
                    return Range.closed(0, 1);
                }
            };

    private static final NumberHandler<Float> FLOAT_HANDLER =
            new NumberHandler<Float>() {
                @Override
                Float getField(JsonObject obj, String key) {
                    return ParserUtil.getNullableFloat(obj, key);
                }

                @Override
                Float getDefaultDefaultValue() {
                    return 0.0f;
                }

                @Override
                Range<Float> getDefaultNormRange() {
                    return Range.closed(0.0f, 1.0f);
                }
            };

    private static final class SingleNumberParamParser<T extends Comparable<T>> extends
            ParamParser<SingleNumberParamSpecImpl.Builder<T>> {

        private final NumberHandler<T> handler;

        SingleNumberParamParser(NumberHandler<T> handler, SingleNumberParamSpecImpl.Builder<T> builder) {
            super(builder);
            this.handler = handler;
        }

        @Override
        protected void readObject(JsonObject obj) {
            super.readObject(obj);
            handler.readSpecObject(builder, obj);
        }
    }

}
