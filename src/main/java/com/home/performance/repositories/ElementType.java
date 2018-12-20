package com.home.performance.repositories;

import lombok.Getter;

@Getter
public class ElementType {

    private String code;

    private ElementType[] elementTypes;

    ElementType(String nCode) {
        this.code = nCode;
        this.elementTypes = null;
    }

    ElementType(String nCode, ElementType[] elementTypes) {
        this.code = nCode;
        this.elementTypes = elementTypes;
    }
}
