package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableList;

public interface ModuleSpec extends BaseParentNode {
    ImmutableList<ParamSpec> getParams();
}
