package net.t3kt.tctrl.schema.impl;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.t3kt.tctrl.schema.ModuleSpec;
import net.t3kt.tctrl.schema.ParamSpec;

@AutoValue
public abstract class ModuleSpecImpl implements ModuleSpec {

    public static Builder builder() {
        return new AutoValue_ModuleSpecImpl.Builder()
                .setChildren(ImmutableList.of())
                .setTags(ImmutableSet.of())
                .setParams(ImmutableList.of());
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setModuleType(String newModuleType);

        public abstract Builder setKey(String newKey);

        public abstract Builder setLabel(String newLabel);

        public abstract Builder setPath(String newPath);

        public abstract Builder setChildren(ImmutableList<ModuleSpec> newChildren);

        public abstract Builder setParams(ImmutableList<ParamSpec> newParams);

        public abstract Builder setGroup(String newGroup);

        public abstract Builder setTags(ImmutableSet<String> newTags);

        public abstract ModuleSpecImpl build();
    }
}
