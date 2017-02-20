package net.t3kt.tctrl.schema.impl;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Range;
import net.t3kt.tctrl.schema.ParamType;
import net.t3kt.tctrl.schema.SingleNumberParamSpec;

@AutoValue
public abstract class SingleNumberParamSpecImpl<T extends Comparable<T>> implements SingleNumberParamSpec<T> {

    public static <T extends Comparable<T>> Builder<T> builder() {
        return new AutoValue_SingleNumberParamSpecImpl.Builder<>();
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

        public abstract Builder<T> setDefaultValue(T newDefaultValue);

        public abstract Builder<T> setLimitRange(Range<T> newLimitRange);

        public abstract Builder<T> setNormRange(Range<T> newNormRange);

        public abstract SingleNumberParamSpecImpl<T> build();
    }
}
