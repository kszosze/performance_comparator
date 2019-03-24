package com.home.performance.collection_sort;

import static com.home.performance.collection_sort.Fixtures.buildEmployeeList;
import static com.home.performance.collection_sort.Fixtures.employeeNameFilter;
import static com.home.performance.collection_sort.Fixtures.buildGiantEmployeeList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import com.home.performance.utils.CustomClockWatch;

import java.util.List;

public class FilteringFunctionsTest {

    @Rule
    public CustomClockWatch stopWatch = new CustomClockWatch();
    static List<String> employeeNameFilter;
    static List<Employee> employeeList;
    static List<Employee> bigEmployeeList;
    static int expected;
    
	@BeforeClass
	public static void init() {
	    employeeNameFilter = employeeNameFilter();
	    employeeList = buildEmployeeList();
	    bigEmployeeList = buildGiantEmployeeList(80000);
		expected = employeeNameFilter().size();		
	}
	
	@Test
	@Ignore
	public void testClassicFilter() {
		List<Employee> result = FilteringFunctions.classicFilter(employeeList, employeeNameFilter);
		
		assertThat(result.size(), is(equalTo((expected))));
		
	}

	@Test
	@Ignore
	public void testClassicWithContainsFilter() {
		List<Employee> result = FilteringFunctions.classicWithContainsFilter(employeeList, employeeNameFilter);
		
		assertThat(result.size(), is(equalTo((expected))));
		
	}
	
	@Test
	@Ignore
	public void testLambdaFilter() {
		List<Employee> result = FilteringFunctions.lambdaFilter(employeeList, employeeNameFilter);
		assertThat(result.size(), is(equalTo(expected)));

	}

	@Test
	@Ignore
	public void testLambdaWithSetFilter() {
		List<Employee> result = FilteringFunctions.lambdaWithSetFilter(employeeList, employeeNameFilter);
		assertThat(result.size(), is(equalTo(expected)));

	}

	@Test
	public void testClassicFilterBigList() {
		List<Employee> result = FilteringFunctions.classicFilter(bigEmployeeList, employeeNameFilter);
		
		assertThat(result.size(), is(equalTo((expected))));
		
	}

	@Test
	public void testClassicWithContainsFilterBigList() {
		List<Employee> result = FilteringFunctions.classicWithContainsFilter(bigEmployeeList, employeeNameFilter);
		
		assertThat(result.size(), is(equalTo((expected))));
		
	}
	
	@Test
	public void testLambdaFilterBigList() {
		List<Employee> result = FilteringFunctions.lambdaFilter(bigEmployeeList, employeeNameFilter);
		assertThat(result.size(), is(equalTo(expected)));

	}

	@Test
	public void testLambdaWithSetFilterBigList() {
		List<Employee> result = FilteringFunctions.lambdaWithSetFilter(bigEmployeeList, employeeNameFilter);
		assertThat(result.size(), is(equalTo(expected)));

	}
}
