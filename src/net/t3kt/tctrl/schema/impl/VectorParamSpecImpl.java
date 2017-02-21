package net.t3kt.tctrl.schema.impl;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.t3kt.tctrl.schema.ParamType;
import net.t3kt.tctrl.schema.VectorParamPartSpec;
import net.t3kt.tctrl.schema.VectorParamSpec;

@AutoValue
public abstract class VectorParamSpecImpl<T extends Comparable<T>> implements VectorParamSpec<T> {

    public static <T extends Comparable<T>> Builder<T> builder(String key, ParamType type) {
        return new AutoValue_VectorParamSpecImpl.Builder<T>()
                .setKey(key)
                .setType(type);
    }

    @AutoValue.Builder
    public abstract static class Builder<T extends Comparable<T>> implements CommonBuilders.ParamSpecBuilder {
        @Override
        public abstract Builder<T> setKey(String newKey);

        @Override
        public abstract Builder<T> setLabel(String newLabel);

        @Override
        public abstract Builder<T> setPath(String newPath);

        @Override
        public abstract Builder<T> setGroup(String newGroup);

        @Override
        public abstract Builder<T> setTags(ImmutableSet<String> newTags);

        abstract ImmutableSet.Builder<String> tagsBuilder();

        @Override
        public Builder addTag(String tag) {
            tagsBuilder().add(tag);
            return this;
        }

        @Override
        public abstract Builder<T> setType(ParamType newType);

        @Override
        public abstract Builder<T> setStyle(String newStyle);

        @Override
        public abstract Builder<T> setOtherType(String newOtherType);

        public abstract Builder<T> setParts(ImmutableList<VectorParamPartSpec<T>> newParts);

        abstract ImmutableList.Builder<VectorParamPartSpec<T>> partsBuilder();

        public Builder<T> addPart(VectorParamPartSpec<T> part) {
            partsBuilder().add(part);
            return this;
        }

        public abstract VectorParamSpecImpl<T> build();
    }
}
