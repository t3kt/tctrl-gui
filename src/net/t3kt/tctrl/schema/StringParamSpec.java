package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableList;

public interface StringParamSpec extends ParamSpec {
    String defaultValue();

    ImmutableList<ParamOption> options();
}
