package net.t3kt.tctrl.schema.impl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.t3kt.tctrl.schema.ModuleSpec;
import net.t3kt.tctrl.schema.ParamType;

public final class CommonBuilders {
    private CommonBuilders() {}

    public interface BaseSchemaNodeBuilder {
        BaseSchemaNodeBuilder setKey(String key);
        BaseSchemaNodeBuilder setLabel(String label);
    }

    public interface SchemaNodeBuilder extends BaseSchemaNodeBuilder {
        SchemaNodeBuilder setPath(String path);
        SchemaNodeBuilder setGroup(String group);
        SchemaNodeBuilder setTags(ImmutableSet<String> tags);
        SchemaNodeBuilder addTag(String tag);
    }

    public interface BaseParentNodeBuilder extends SchemaNodeBuilder {
        BaseParentNodeBuilder setChildren(ImmutableList<ModuleSpec> children);
        BaseParentNodeBuilder addChild(ModuleSpec child);
    }

    public interface ParamSpecBuilder extends SchemaNodeBuilder {
        ParamSpecBuilder setType(ParamType type);
        ParamSpecBuilder setStyle(String style);
        ParamSpecBuilder setOtherType(String otherType);
    }
}
