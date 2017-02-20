package net.t3kt.tctrl.schema.impl;

import com.google.auto.value.AutoValue;
import com.google.common.collect.Range;
import net.t3kt.tctrl.schema.VectorParamPartSpec;

import javax.annotation.Nullable;

@AutoValue
public abstract class VectorParamPartSpecImpl<T extends Comparable<T>> implements VectorParamPartSpec<T> {
    public static <T extends Comparable<T>> Builder<T> builder() {
        return new AutoValue_VectorParamPartSpecImpl.Builder<>();
    }

    @AutoValue.Builder
    public abstract static class Builder<T extends Comparable<T>> {
        public abstract Builder<T> setKey(String newKey);

        public abstract Builder<T> setLabel(String newLabel);

        public abstract Builder<T> setPath(String newPath);

        public abstract Builder<T> setLimitRange(@Nullable Range<T> newLimitRange);

        public abstract Builder<T> setNormRange(Range<T> newNormRange);

        public abstract Builder<T> setDefaultValue(T newDefaultValue);

        public abstract VectorParamPartSpecImpl<T> build();
    }
}
