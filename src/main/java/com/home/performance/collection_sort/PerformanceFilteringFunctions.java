package com.home.performance.collection_sort;

import lombok.extern.slf4j.Slf4j;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.List;

import static com.home.performance.collection_sort.Fixtures.*;

@Slf4j
@State(Scope.Benchmark)
public class PerformanceFilteringFunctions {

	static final List<String> employeeNameFilter = employeeNameFilter();
	static final List<Employee> employeeList = buildEmployeeList();
	static final List<Employee> bigEmployeeList = buildGiantEmployeeList(80000);
	static final int EXPECTED = employeeNameFilter().size();

	@Benchmark
	public void testClassicFilter() {
		FilteringFunctions.classicFilter(employeeList, employeeNameFilter);
	}

	@Benchmark
	public void testClassicWithContainsFilter() {
		FilteringFunctions.classicWithContainsFilter(employeeList, employeeNameFilter);
	}

	@Benchmark
	public void testLambdaFilter() {
		FilteringFunctions.lambdaFilter(employeeList, employeeNameFilter);
	}

	@Benchmark
	public void testLambdaWithSetFilter() {
		FilteringFunctions.lambdaWithSetFilter(employeeList, employeeNameFilter);
	}

	@Benchmark
	public void testClassicFilterBigList() {
		FilteringFunctions.classicFilter(bigEmployeeList, employeeNameFilter);
	}

	@Benchmark
	public void testClassicWithContainsFilterBigList() {
		FilteringFunctions.classicWithContainsFilter(bigEmployeeList, employeeNameFilter);
	}

	@Benchmark
	public void testLambdaFilterBigList() {
		FilteringFunctions.lambdaFilter(bigEmployeeList, employeeNameFilter);
	}

	@Benchmark
	public void testLambdaWithSetFilterBigList() {
		FilteringFunctions.lambdaWithSetFilter(bigEmployeeList, employeeNameFilter);
	}

}
