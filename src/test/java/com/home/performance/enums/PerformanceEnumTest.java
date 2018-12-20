package com.home.performance.enums;

import com.home.performance.utils.CustomClockWatch;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PerformanceEnumTest {

    @Rule
    public CustomClockWatch stopWatch = new CustomClockWatch();

    @Test
    public void streamEnumFromString() {
        assertNotNull(StreamEnum.fromString("enum3"));
    }

    @Test
    public void hashMapEnumFromString() {
        assertNotNull(HashMapEnum.fromString("enum3"));
    }

    @Test
    public void switchEnumFromString() {
        assertNotNull(SwitchEnum.fromString("enum3"));
    }
}