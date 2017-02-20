package net.t3kt.tctrl.schema;

import com.google.common.collect.Range;

import javax.annotation.Nullable;

public interface VectorParamPartSpec<T extends Comparable> extends BaseSchemaNode {
    String getPath();

    @Nullable
    Range<T> getLimitRange();

    Range<T> getNormRange();

    T getDefaultValue();
}
