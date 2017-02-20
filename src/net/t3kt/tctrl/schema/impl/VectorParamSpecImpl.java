package net.t3kt.tctrl.schema.impl;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.t3kt.tctrl.schema.ParamType;
import net.t3kt.tctrl.schema.VectorParamPartSpec;
import net.t3kt.tctrl.schema.VectorParamSpec;

@AutoValue
public abstract class VectorParamSpecImpl<T extends Comparable<T>> implements VectorParamSpec<T> {

    public static <T extends Comparable<T>> Builder<T> builder() {
        return new AutoValue_VectorParamSpecImpl.Builder<>();
    }

    @AutoValue.Builder
    public abstract static class Builder<T extends Comparable<T>> {
        public abstract Builder<T> setKey(String newKey);

        public abstract Builder<T> setLabel(String newLabel);

        public abstract Builder<T> setPath(String newPath);

        public abstract Builder<T> setGroup(String newGroup);

        public abstract Builder<T> setTags(ImmutableSet<String> newTags);

        public abstract Builder<T> setType(ParamType newType);

        public abstract Builder<T> setStyle(String newStyle);

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
