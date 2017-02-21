package net.t3kt.tctrl.schema.impl;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.t3kt.tctrl.schema.ModuleSpec;
import net.t3kt.tctrl.schema.ParamSpec;

@AutoValue
public abstract class ModuleSpecImpl implements ModuleSpec {

    public static Builder builder(String key) {
        return new AutoValue_ModuleSpecImpl.Builder()
                .setKey(key)
                .setChildren(ImmutableList.of())
                .setTags(ImmutableSet.of())
                .setParams(ImmutableList.of());
    }

    @AutoValue.Builder
    public abstract static class Builder implements CommonBuilders.BaseParentNodeBuilder {
        public abstract Builder setModuleType(String newModuleType);

        @Override
        public abstract Builder setKey(String newKey);

        @Override
        public abstract Builder setLabel(String newLabel);

        @Override
        public abstract Builder setPath(String newPath);

        @Override
        public abstract Builder setChildren(ImmutableList<ModuleSpec> newChildren);

        abstract ImmutableList.Builder<ModuleSpec> childrenBuilder();

        @Override
        public Builder addChild(ModuleSpec child) {
            childrenBuilder().add(child);
            return this;
        }

        public abstract Builder setParams(ImmutableList<ParamSpec> newParams);

        abstract ImmutableList.Builder<ParamSpec> paramsBuilder();

        public Builder addParam(ParamSpec param) {
            paramsBuilder().add(param);
            return this;
        }

        public abstract Builder setGroup(String newGroup);

        @Override
        public abstract Builder setTags(ImmutableSet<String> newTags);

        abstract ImmutableSet.Builder<String> tagsBuilder();

        @Override
        public Builder addTag(String tag) {
            tagsBuilder().add(tag);
            return this;
        }

        public abstract ModuleSpecImpl build();
    }
}
