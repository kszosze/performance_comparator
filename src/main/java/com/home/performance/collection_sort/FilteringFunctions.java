package com.home.performance.collection_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class FilteringFunctions {

	public static List<Employee> classicFilter(List<Employee> employeeList, List<String> employeeNamesFilter) {
		List<Employee> filteredList = new ArrayList<>();	 
	    for (Employee employee : employeeList) {
	        for (String name : employeeNamesFilter) {
	            if (employee.getName().equalsIgnoreCase(name)) {
	                filteredList.add(employee);
	            }
	        }
	    }
	    
	    return filteredList;
	}
	
	public static List<Employee> classicWithContainsFilter(List<Employee> employeeList, List<String> employeeNamesFilter) {
		List<Employee> filteredList = new ArrayList<>();	 
	    for (Employee employee : employeeList) {
	            if (employeeNamesFilter.contains(employee.getName())) {
	                filteredList.add(employee);
	            }
	    }	    
	    return filteredList;
	}
	
	public static List<Employee> lambdaFilter(List<Employee> employeeList, List<String> employeeNamesFilter) {
		List<Employee> filteredList = new ArrayList<>();
		
		filteredList = employeeList.stream()
			      .filter(employee -> employeeNamesFilter.contains(employee.getName()))
			      .collect(Collectors.toList());
			 
	    
	    return filteredList;
	}
	
	public static List<Employee> lambdaWithSetFilter(List<Employee> employeeList, List<String> employeeNamesFilter) {
		List<Employee> filteredList = new ArrayList<>();	 
		 Set<String> nameFilterSet = employeeNamesFilter.stream().collect(Collectors.toSet());
		 
		    filteredList = employeeList.stream()
		      .filter(employee -> nameFilterSet.contains(employee.getName()))
		      .collect(Collectors.toList());
	    
	    return filteredList;
	}
}
