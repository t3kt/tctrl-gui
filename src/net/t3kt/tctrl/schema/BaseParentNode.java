package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableList;

public abstract class BaseParentNode extends SchemaNode {
    protected ImmutableList<ModuleSpec> children;

    BaseParentNode(String key, String label) {
        super(key, label);
    }


}
