package net.t3kt.tctrl.schema.impl;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.t3kt.tctrl.schema.AppSchema;
import net.t3kt.tctrl.schema.ModuleSpec;

@AutoValue
public abstract class AppSchemaImpl implements AppSchema {

    public static Builder builder() {
        return new AutoValue_AppSchemaImpl.Builder()
                .setChildren(ImmutableList.of())
                .setTags(ImmutableSet.of());
    }


    @AutoValue.Builder
    public abstract static class Builder implements CommonBuilders.BaseParentNodeBuilder {
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

        public abstract AppSchemaImpl build();
    }
}
