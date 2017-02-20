package net.t3kt.tctrl.schema.impl;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.t3kt.tctrl.schema.ParamOption;
import net.t3kt.tctrl.schema.ParamType;
import net.t3kt.tctrl.schema.StringParamSpec;

@AutoValue
public abstract class StringParamSpecImpl implements StringParamSpec {

    public static Builder builder() {
        return new AutoValue_StringParamSpecImpl.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setKey(String newKey);

        public abstract Builder setLabel(String newLabel);

        public abstract Builder setPath(String newPath);

        public abstract Builder setGroup(String newGroup);

        public abstract Builder setTags(ImmutableSet<String> newTags);

        public abstract Builder setType(ParamType newType);

        public abstract Builder setStyle(String newStyle);

        public abstract Builder setOtherType(String newOtherType);

        public abstract Builder setDefaultValue(String newDefaultValue);

        public abstract Builder setOptions(ImmutableList<ParamOption> newOptions);

        public abstract StringParamSpecImpl build();
    }
}
