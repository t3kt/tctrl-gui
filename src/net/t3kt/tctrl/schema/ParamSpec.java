package net.t3kt.tctrl.schema;

import javax.annotation.Nullable;

public interface ParamSpec extends SchemaNode {

    ParamType type();

    @Nullable
    String style();

    @Nullable
    String otherType();

    @Nullable
    String group();
}
