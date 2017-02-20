package net.t3kt.tctrl.schema;

public class ParamSpec extends SchemaNode {
    private final ParamType type;
    private String path;
    private String otherType;

    ParamSpec(String key, String label, ParamType type) {
        super(key, label);
        this.type = type;
    }

    public ParamType getType() {
        return type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getOtherType() {
        return otherType;
    }

    public void setOtherType(String otherType) {
        this.otherType = otherType;
    }
}
