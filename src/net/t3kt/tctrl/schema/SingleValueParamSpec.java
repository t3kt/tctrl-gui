package net.t3kt.tctrl.schema;

public interface SingleValueParamSpec<T> extends ParamSpec {
    T defaultValue();
}
