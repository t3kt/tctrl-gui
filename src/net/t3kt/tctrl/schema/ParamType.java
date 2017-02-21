package net.t3kt.tctrl.schema;

import com.google.common.base.Enums;

import java.util.Optional;

public enum ParamType {
    OTHER,
    BOOL,
    STRING,
    INT,
    FLOAT,
    IVEC,
    FVEC,
    MENU,
    TRIGGER;

    public static Optional<ParamType> parseType(String typeStr) {
        if (typeStr == null) {
            return Optional.empty();
        }
        return Enums.getIfPresent(ParamType.class, typeStr.toUpperCase()).toJavaUtil();
    }
}
