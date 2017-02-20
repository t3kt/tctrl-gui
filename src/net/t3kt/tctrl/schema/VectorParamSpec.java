package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableList;

public interface VectorParamSpec<T extends Comparable> extends ParamSpec {
    ImmutableList<VectorParamPartSpec<T>> getParts();
}
