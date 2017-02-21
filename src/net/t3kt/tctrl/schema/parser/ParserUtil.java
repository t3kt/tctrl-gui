package net.t3kt.tctrl.schema.parser;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Range;
import net.t3kt.tctrl.schema.impl.CommonBuilders;

import javax.annotation.Nullable;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonString;

final class ParserUtil {
    private ParserUtil() {}

    static String getRequiredString(JsonObject obj, String key) {
        if (!obj.containsKey(key)) {
            throw new IllegalArgumentException(String.format("Object must have field '%s'", key));
        }
        return obj.getString(key);
    }

    static JsonArray getRequiredArray(JsonObject obj, String key) {
        if (!obj.containsKey(key)) {
            throw new IllegalArgumentException(String.format("Object must have field '%s'", key));
        }
        return obj.getJsonArray(key);
    }

    static void parseTags(CommonBuilders.SchemaNodeBuilder builder, JsonObject obj) {
        if (!obj.containsKey("tags")) {
            return;
        }
        JsonArray array = obj.getJsonArray("tags");
        builder.setTags(ImmutableSet.copyOf(array.getValuesAs(JsonString::getString)));
    }

    static void parseNodeCommonAttrs(CommonBuilders.SchemaNodeBuilder builder, JsonObject obj) {
        builder.setPath(obj.getString("path", obj.getString("key")));
        builder.setLabel(obj.getString("label", null));
        parseTags(builder, obj);
    }

    @Nullable
    static <T extends Comparable<T>> Range<T> makeRange(@Nullable T minValue, @Nullable T maxValue) {
        if (minValue == null) {
            if (maxValue == null) {
                return null;
            } else {
                return Range.atMost(maxValue);
            }
        } else {
            if (maxValue == null) {
                return Range.atLeast(minValue);
            } else {
                return Range.closed(minValue, maxValue);
            }
        }
    }

    @Nullable
    static Integer getNullableInt(JsonObject obj, String key) {
        if (!obj.containsKey(key) || obj.isNull(key)) {
            return null;
        }
        return obj.getInt(key);
    }

    @Nullable
    static Float getNullableFloat(JsonObject obj, String key) {
        if (!obj.containsKey(key) || obj.isNull(key)) {
            return null;
        }
        return (float) obj.getJsonNumber(key).doubleValue();
    }
}
