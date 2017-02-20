package net.t3kt.tctrl.schema;

import com.google.common.collect.Range;

import javax.annotation.Nullable;

public interface SingleNumberParamSpec<T extends Comparable<T>> extends ParamSpec {
    T defaultValue();

    @Nullable
    Range<T> limitRange();

    Range<T> normRange();
}
