package net.t3kt.tctrl.schema;

import javax.annotation.Nullable;

public interface ParamSpec extends SchemaNode {

    ParamType getType();

    String getPath();

    @Nullable
    String getOtherType();
}
