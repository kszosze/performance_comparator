package com.home.performance.enums;

public enum SwitchEnum {


    ENUM1("enum1"), ENUM2("enum2"), ENUM3("enum3"), DEFAULT("default");

    private final String value;

    SwitchEnum(String value) {
        this.value = value;
    }

    public static SwitchEnum fromString(final String value) {
        SwitchEnum result;
        switch (value) {
            case "enum1":
                result = ENUM1;
                break;
            case "enum2":
                result = ENUM2;
                break;
            case "enum3":
                result = ENUM3;
                break;
            default:
                result = DEFAULT;
            break;    
        }
        return result;

    }

}
