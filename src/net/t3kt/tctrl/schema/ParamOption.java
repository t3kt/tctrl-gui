package net.t3kt.tctrl.schema;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ParamOption implements BaseSchemaNode {
    @Override
    public abstract String key();

    @Override
    public abstract String label();

    public static ParamOption create(String newKey, String newLabel) {
        return new AutoValue_ParamOption(newKey, newLabel);
    }
}
