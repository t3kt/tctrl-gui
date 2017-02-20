package net.t3kt.tctrl.schema;

public abstract class SingleValueParamSpec<T> extends ParamSpec {
    SingleValueParamSpec(String key, String label, ParamType type) {
        super(key, label, type);
    }
}
