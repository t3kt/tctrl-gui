package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableList;

import javax.annotation.Nullable;

public interface ModuleSpec extends BaseParentNode {
    @Nullable
    String getModuleType();

    ImmutableList<ParamSpec> getParams();
}
