package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableList;

public interface SchemaNode extends BaseSchemaNode {

    String getGroup();

    ImmutableList<String> getTags();

    // TODO: properties
}
