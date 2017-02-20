package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableList;

public abstract class SchemaNode extends BaseSchemaNode {
    private String group;
    private ImmutableList<String> tags;
    // TODO: properties

    SchemaNode(String key, String label) {
        super(key, label);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ImmutableList<String> getTags() {
        return tags;
    }

    public void setTags(Iterable<String> tags) {
        this.tags = ImmutableList.copyOf(tags);
    }
}
