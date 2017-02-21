package net.t3kt.tctrl.schema.impl;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableSet;
import net.t3kt.tctrl.schema.ParamSpec;
import net.t3kt.tctrl.schema.ParamType;

@AutoValue
public abstract class ParamSpecImpl implements ParamSpec {

    public static ParamSpecImpl.Builder builder(String key, ParamType type) {
        return new AutoValue_ParamSpecImpl.Builder()
                .setKey(key)
                .setType(type);
    }

    @AutoValue.Builder
    public abstract static class Builder implements CommonBuilders.ParamSpecBuilder {
        @Override
        public abstract Builder setKey(String newKey);

        @Override
        public abstract Builder setLabel(String newLabel);

        @Override
        public abstract Builder setPath(String newPath);

        @Override
        public abstract Builder setGroup(String newGroup);

        @Override
        public abstract Builder setTags(ImmutableSet<String> newTags);

        abstract ImmutableSet.Builder<String> tagsBuilder();

        @Override
        public Builder addTag(String tag) {
            tagsBuilder().add(tag);
            return this;
        }

        @Override
        public abstract Builder setType(ParamType newType);

        @Override
        public abstract Builder setStyle(String newStyle);

        @Override
        public abstract Builder setOtherType(String newOtherType);

        public abstract ParamSpecImpl build();
    }
}
