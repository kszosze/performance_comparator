package com.home.performance.collection_sort;

import static com.home.performance.collection_sort.Fixtures.buildEmployeeList;
import static com.home.performance.collection_sort.Fixtures.buildGiantEmployeeList;
import static com.home.performance.collection_sort.Fixtures.employeeNameFilter;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@Slf4j
@State(Scope.Benchmark)
public class PerformanceFilteringFunctions {

	static final List<String> employeeNameFilter = employeeNameFilter();

	static final List<Employee> employeeList = buildEmployeeList();

	static final List<Employee> smallEmployeeList = buildGiantEmployeeList(1000);

	static final List<Employee> mediumEmployeeList = buildGiantEmployeeList(25000);

	static final List<Employee> bigEmployeeList = buildGiantEmployeeList(80000);

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
	public void testClassicWithContainsFilterSmallList() {
		FilteringFunctions.classicWithContainsFilter(smallEmployeeList, employeeNameFilter);
	}

	@Benchmark
	public void testLambdaFilterSmallList() {
		FilteringFunctions.lambdaFilter(smallEmployeeList, employeeNameFilter);
	}

	@Benchmark
	public void testLambdaWithSetFilterSmallList() {
		FilteringFunctions.lambdaWithSetFilter(smallEmployeeList, employeeNameFilter);
	}

	@Benchmark
	public void testClassicFilterSmallList() {
		FilteringFunctions.classicFilter(smallEmployeeList, employeeNameFilter);
	}

	@Benchmark
	public void testClassicWithContainsFilterMediumList() {
		FilteringFunctions.classicWithContainsFilter(mediumEmployeeList, employeeNameFilter);
	}

	@Benchmark
	public void testLambdaFilterMediumList() {
		FilteringFunctions.lambdaFilter(mediumEmployeeList, employeeNameFilter);
	}

	@Benchmark
	public void testLambdaWithSetFilterMediumList() {
		FilteringFunctions.lambdaWithSetFilter(mediumEmployeeList, employeeNameFilter);
	}

	@Benchmark
	public void testClassicFilterMediumList() {
		FilteringFunctions.classicFilter(mediumEmployeeList, employeeNameFilter);
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
