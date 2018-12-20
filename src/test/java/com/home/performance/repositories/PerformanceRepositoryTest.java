package com.home.performance.repositories;

import com.home.performance.utils.CustomClockWatch;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PerformanceRepositoryTest {


    @Rule
    public CustomClockWatch stopWatch = new CustomClockWatch();

    private StreamRepository streamRepository = new StreamRepository();
    private HashMapRepository mapRepository = new HashMapRepository();

    @Test
    public void streamFindElement() throws Exception {
        assertNotNull(streamRepository.findElement("Type28"));
    }

    @Test
    public void mapFindElement() {
        assertNotNull(mapRepository.findElement("Type28"));
    }
}