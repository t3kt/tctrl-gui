package net.t3kt.tctrl.schema;

import com.google.common.collect.Range;

import javax.annotation.Nullable;

public interface VectorParamPartSpec<T extends Comparable<T>> extends BaseSchemaNode {
    String path();

    @Nullable
    Range<T> limitRange();

    Range<T> normRange();

    T defaultValue();
}
