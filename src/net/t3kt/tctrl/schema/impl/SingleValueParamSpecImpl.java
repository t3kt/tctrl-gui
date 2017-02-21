package net.t3kt.tctrl.schema.impl;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableSet;
import net.t3kt.tctrl.schema.ParamType;
import net.t3kt.tctrl.schema.SingleValueParamSpec;

@AutoValue
public abstract class SingleValueParamSpecImpl<T> implements SingleValueParamSpec<T> {
    public static <T> Builder<T> builder(String key, ParamType type) {
        return new AutoValue_SingleValueParamSpecImpl.Builder<T>()
                .setKey(key)
                .setType(type);
    }

    @AutoValue.Builder
    public abstract static class Builder<T> implements CommonBuilders.SingleValueParamSpecBuilder<T> {
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

        @Override
        public abstract Builder<T> setDefaultValue(T newDefaultValue);

        public abstract SingleValueParamSpecImpl<T> build();
    }

}
