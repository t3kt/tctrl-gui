package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableSet;

import javax.annotation.Nullable;

public interface ParamSpec extends SchemaNode {

    ParamType getType();

    String getStyle();

    String getPath();

    @Nullable
    String getOtherType();
}
