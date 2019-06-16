package com.home.performance.enums;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.Objects;

@State(Scope.Benchmark)
public class PerformanceEnum {

    public static final String ENUM_3 = "enum3";

    @Benchmark
    public void streamEnumFromString() {
        Objects.nonNull(StreamEnum.fromString(ENUM_3));
    }

    @Benchmark
    public void hashMapEnumFromString() {
        Objects.nonNull(HashMapEnum.fromString(ENUM_3));
    }

    @Benchmark
    public void switchEnumFromString() {
        Objects.nonNull(SwitchEnum.fromString(ENUM_3));
    }
}