package net.t3kt.tctrl.schema.parser;

import net.t3kt.tctrl.schema.*;
import net.t3kt.tctrl.schema.impl.AppSchemaImpl;
import net.t3kt.tctrl.schema.impl.CommonBuilders;
import net.t3kt.tctrl.schema.impl.ModuleSpecImpl;

import javax.json.JsonArray;
import javax.json.JsonObject;

public class JsonSchemaParser {

    public AppSchema parseAppSchema(JsonObject obj) {
        String key = ParserUtil.getRequiredString(obj, "key");
        AppSchemaImpl.Builder builder = AppSchemaImpl.builder(key);
        builder.setDescription(obj.getString("description", null));
        ParserUtil.parseNodeCommonAttrs(builder, obj);
        parseChildModules(builder, obj);
        return builder.build();
    }

    public ModuleSpec parseModuleSpec(JsonObject obj) {
        String key = ParserUtil.getRequiredString(obj, "key");
        ModuleSpecImpl.Builder builder = ModuleSpecImpl.builder(key);
        builder.setModuleType(obj.getString("moduleType", null));
        builder.setGroup(obj.getString("group", null));
        ParserUtil.parseNodeCommonAttrs(builder, obj);
        parseParams(builder, obj);
        parseChildModules(builder, obj);
        return builder.build();
    }

    public ParamSpec parseParamSpec(JsonObject obj) {
        return ParamParser.parseObject(obj);
    }

    private void parseParams(ModuleSpecImpl.Builder builder, JsonObject obj) {
        if (!obj.containsKey("params")) {
            return;
        }
        JsonArray array = obj.getJsonArray("params");
        for (JsonObject paramObj : array.getValuesAs(JsonObject.class)) {
            ParamSpec param = parseParamSpec(paramObj);
            builder.addParam(param);
        }
    }

    private void parseChildModules(CommonBuilders.BaseParentNodeBuilder builder, JsonObject obj) {
        if (!obj.containsKey("children")) {
            return;
        }
        JsonArray array = obj.getJsonArray("children");
        for (JsonObject childObj : array.getValuesAs(JsonObject.class)) {
            ModuleSpec child = parseModuleSpec(childObj);
            builder.addChild(child);
        }
    }

}
