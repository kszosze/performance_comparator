package com.home.performance.enums;

import java.util.Map;

public enum HashMapEnum {

    ENUM1("enum1"), ENUM2("enum2"), ENUM3("enum3"), DEFAULT("default");

    private String value;

    private static Map<String, HashMapEnum> resolveEnum = Map.of("enum1", ENUM1, "enum2", ENUM2, "enum3", ENUM3);

    HashMapEnum(String value) {
        this.value = value;
    }

    public static HashMapEnum fromString(final String value) {
        return resolveEnum.getOrDefault(value, DEFAULT);
    }
}
