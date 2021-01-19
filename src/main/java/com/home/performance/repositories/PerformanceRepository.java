package com.home.performance.repositories;


import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class PerformanceRepository {


    private final StreamRepository streamRepository = new StreamRepository();
    private final HashMapRepository mapRepository = new HashMapRepository();

    @Benchmark
    public void streamFindElement() throws Exception {
        streamRepository.findElement("Type28");
    }

    @Benchmark
    public void mapFindElement() {
        mapRepository.findElement("Type28");
    }
}