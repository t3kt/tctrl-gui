package net.t3kt.tctrl.schema;

import com.google.common.collect.Range;

import javax.annotation.Nullable;

public interface SingleNumberParamSpec<T extends Comparable> extends SingleValueParamSpec<T> {
    @Nullable
    Range<T> getLimitRange();

    Range<T> getNormRange();
}
