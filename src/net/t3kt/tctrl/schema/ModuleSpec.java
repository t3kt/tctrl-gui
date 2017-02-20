package net.t3kt.tctrl.schema;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class ModuleSpec extends BaseParentNode {
    private ImmutableList<ParamSpec> params;

    ModuleSpec(String key, String label) {
        super(key, label);
    }

    public ImmutableList<ParamSpec> getParams() {
        return params;
    }

    public void setParams(List<ParamSpec> params) {
        this.params = ImmutableList.copyOf(params);
    }
}
