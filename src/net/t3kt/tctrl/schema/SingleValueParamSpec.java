package net.t3kt.tctrl.schema;

public interface SingleValueParamSpec<T extends Comparable> extends ParamSpec {

    T getDefaultValue();
}
