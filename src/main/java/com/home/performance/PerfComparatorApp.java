package com.home.performance;

import com.home.performance.collection_sort.PerformanceFilteringFunctions;
import com.home.performance.enums.PerformanceEnum;
import com.home.performance.repositories.PerformanceRepository;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

public class PerfComparatorApp {

    public static void main(String[] args) throws Exception {

        Options opt = new OptionsBuilder()
                .include(PerformanceFilteringFunctions.class.getSimpleName())
                .include(PerformanceEnum.class.getSimpleName())
                .include(PerformanceRepository.class.getSimpleName())
                .timeUnit(TimeUnit.MICROSECONDS)
                .mode(Mode.Throughput)
                .forks(1)
                .build();


        new Runner(opt).run();
    }
}
