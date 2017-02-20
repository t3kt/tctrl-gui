package net.t3kt.tctrl.schema;

public abstract class BaseSchemaNode {

    protected final String key;
    protected String label;

    BaseSchemaNode(String key, String label) {
        this.key = key;
        this.label = label;
    }

    public String getKey() {
        return key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
