package com.home.performance.enums;

import java.util.stream.Stream;

public enum StreamEnum {

    ENUM1("enum1"), ENUM2("enum2"), ENUM3("enum3"), DEFAULT("default");

    private String value;

    StreamEnum(String value) {
        this.value = value;
    }

    public static StreamEnum fromString(final String value) {
        return Stream.of(StreamEnum.values())
                .filter(inValue -> inValue.value.equals(value))
                .findFirst().orElse(DEFAULT);
    }
}
