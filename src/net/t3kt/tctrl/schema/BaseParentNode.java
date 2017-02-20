package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableList;

public interface BaseParentNode extends SchemaNode {
    ImmutableList<ModuleSpec> getChildren();
}
