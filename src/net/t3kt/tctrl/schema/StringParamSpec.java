package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableList;

public interface StringParamSpec extends SingleValueParamSpec<String> {
    ImmutableList<ParamOption> getOptions();
}
