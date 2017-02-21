package net.t3kt.tctrl.schema.impl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Range;
import net.t3kt.tctrl.schema.ModuleSpec;
import net.t3kt.tctrl.schema.ParamSpec;
import net.t3kt.tctrl.schema.ParamType;
import net.t3kt.tctrl.schema.SingleValueParamSpec;

public final class CommonBuilders {
    private CommonBuilders() {}

    public interface BaseSchemaNodeBuilder {
        BaseSchemaNodeBuilder setKey(String key);
        BaseSchemaNodeBuilder setLabel(String label);
    }

    public interface SchemaNodeBuilder extends BaseSchemaNodeBuilder {
        SchemaNodeBuilder setPath(String path);
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
        SchemaNodeBuilder setGroup(String group);

        ParamSpec build();
    }

    public interface SingleValueParamSpecBuilder<T> extends ParamSpecBuilder {
        SingleValueParamSpecBuilder<T> setDefaultValue(T defaultValue);
    }

    public interface SingleNumberSpecBuilder<T extends Comparable<T>> extends BaseSchemaNodeBuilder {
        SingleNumberSpecBuilder<T> setPath(String path);
        SingleNumberSpecBuilder<T> setDefaultValue(T defaultValue);
        SingleNumberSpecBuilder<T> setLimitRange(Range<T> limitRange);
        SingleNumberSpecBuilder<T> setNormRange(Range<T> normRange);
    }
}
