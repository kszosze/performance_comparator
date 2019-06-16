package com.home.performance.collection_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Fixtures {

	private Fixtures() {
	}

	public static List<Employee> buildEmployeeList() {
		return Arrays.asList(new Employee(1, "Mike", 1), new Employee(2, "John", 1), new Employee(3, "Mary", 1),
				new Employee(4, "Joe", 2), new Employee(5, "Nicole", 2), new Employee(6, "Alice", 2),
				new Employee(7, "Bob", 3), new Employee(8, "Scarlett", 3));
	}

	public static List<Employee> buildGiantEmployeeList(int size) {
		List<Employee> employeeList = new ArrayList<>(buildEmployeeList());
		for (int pos = 0; pos < size; pos++) {
			employeeList.add(new Employee(pos, nameList.get(rand.nextInt(50)).concat(secondNameList.get(rand.nextInt(50))), pos));
		}
		return employeeList;
	}

	public static List<String> employeeNameFilter() {
		return Arrays.asList("Alice", "Mike", "Bob");
	}

	private static Random rand = new Random();
	
	private static List<String> nameList = Arrays.asList("Dewitt", "Kelvin", "Daniela", "Brett", "Bailey", "Lisandra",
			"Stephaine", "Lelah", "Jeanetta", "Jackqueline", "Kylee", "Johana", "Carlos", "Hedwig", "Louvenia", "Drema",
			"Vernie", "Raymundo", "Erin", "Karole", "Harry", "Pinkie", "Sheldon", "Antonina", "Myesha", "Guadalupe",
			"Clora", "Sharri", "Syreeta", "Timothy", "Hans", "Maranda", "Valorie", "Allena", "Gertrudis", "Janene",
			"Dorothy", "Shirely", "Mindy", "Joann", "Shena", "Willy", "Savannah", "Elena", "Modesta", "Shin", "Ligia",
			"Yen", "Cherrie", "Janeen");

	private static List<String> secondNameList = Arrays.asList("Juliann", "Mitch", "Belen", "Michelina", "Marla", "Marlyn",
			"Cortney", "Kelle", "Marcela", "Dannie", "Norene", "Felix", "Maryanna", "Rubin", "Liza", "Carla", "Brady",
			"Hortencia", "Yasuko", "Nedra", "Bernardina", "Brittany", "Sasha", "Dania", "Cindy", "Hsiu", "Delfina",
			"Berta", "Floy", "Junita", "Shani", "Ignacio", "Patty", "Iliana", "Priscila", "Amada", "Lu", "Kirsten",
			"Leida", "Eloise", "Luise", "Scot", "Robby", "Harrison", "Suk", "Thomasina", "Vicente", "Terisa", "Sacha",
			"Rosalee");
}