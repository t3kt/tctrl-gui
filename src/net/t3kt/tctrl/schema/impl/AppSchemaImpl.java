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
    public abstract static class Builder {
        public abstract Builder setKey(String newKey);

        public abstract Builder setLabel(String newLabel);

        public abstract Builder setPath(String newPath);

        public abstract Builder setChildren(ImmutableList<ModuleSpec> newChildren);

        public abstract Builder setGroup(String newGroup);

        public abstract Builder setTags(ImmutableSet<String> newTags);

        public abstract AppSchemaImpl build();
    }
}
