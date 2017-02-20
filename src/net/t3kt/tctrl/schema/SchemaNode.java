package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableSet;

public interface SchemaNode extends BaseSchemaNode {
    String getPath();

    String getGroup();

    ImmutableSet<String> getTags();

    // TODO: properties
}
