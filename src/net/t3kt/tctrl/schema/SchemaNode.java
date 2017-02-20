package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableSet;

import javax.annotation.Nullable;

public interface SchemaNode extends BaseSchemaNode {
    String path();

    @Nullable
    String group();

    ImmutableSet<String> tags();

    // TODO: properties
}
