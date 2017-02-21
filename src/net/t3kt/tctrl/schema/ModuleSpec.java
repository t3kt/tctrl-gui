package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableList;

import javax.annotation.Nullable;

public interface ModuleSpec extends BaseParentNode {
    @Nullable
    String moduleType();

    @Nullable
    String group();

    ImmutableList<ParamSpec> params();
}
