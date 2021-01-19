package com.home.performance.repositories;

import lombok.Getter;

@Getter
public class ElementType {

    private final String code;

    private final ElementType[] elementTypes;

    ElementType(String nCode) {
        this.code = nCode;
        this.elementTypes = null;
    }

    ElementType(String nCode, ElementType[] elementTypes) {
        this.code = nCode;
        this.elementTypes = elementTypes;
    }
}
