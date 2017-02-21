package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableSet;

public interface SchemaNode extends BaseSchemaNode {
    String path();

    ImmutableSet<String> tags();

    // TODO: properties
}
