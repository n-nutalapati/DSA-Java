package misc;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
    	
//    	List<Integer> numbers = List.of(10, 15, 20, 25, 30);
//    	
//    	List<Integer> even = numbers.stream()
//    	.filter(num -> num %2 == 0)
//    	.toList();
//    	
//    	System.out.println(even);
    	
//    	List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 3, 6);
    	
//    	List<Integer> duplicate = numbers.stream()
//    	.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//    		.entrySet().stream()
//    		.filter(entry -> entry.getValue() > 1)
//			.map(Map.Entry::getKey)
//				.toList();

//		Set<Integer> seen = new HashSet<>();
//
//		List<Integer> duplicate = numbers.stream()
//						.filter(n -> !seen.add(n))
//						.distinct()
//						.toList();
//
//		System.out.println(duplicate);


//		List<Integer> numbers = List.of(1, 2, 3, 2, 1, 4, 5);
//
//		Set<Integer> seen = new HashSet<>();
//
//		Integer firstNonRepeatingElement = numbers.stream()
//				.collect(Collectors.groupingBy(
//						Function.identity(),
//						LinkedHashMap::new,
//						Collectors.counting()))
//				.entrySet().stream()
//				.filter(entry -> entry.getValue() == 1)
//				.findFirst()
//				.map(Map.Entry::getKey)
//				.get();
//
//		System.out.println(firstNonRepeatingElement);

//		List<misc.Employee> employees = List.of(
//				new misc.Employee(1, "Ravi", 50000),
//				new misc.Employee(2, "Anil", 70000),
//				new misc.Employee(3, "Kiran", 70000),
//				new misc.Employee(4, "Bala", 40000)
//		);

//		List<misc.Employee> res = employees.stream()
//				.sorted(Comparator.comparing(misc.Employee::getSalary).reversed()
//						.thenComparing(misc.Employee::getName)).toList();
//
//		System.out.println(res);

//		Map<Double, List<misc.Employee>> res = employees
//				.stream()
//				.collect(Collectors.groupingBy(misc.Employee::getSalary));
//
//		System.out.println(res);

//		List<List<String>> names = List.of(
//				List.of("Java", "Spring"),
//				List.of("Docker", "Kubernetes"),
//				List.of("AWS")
//		);
//
//		List<String> res = names.stream()
//				.flatMap(Collection::stream)
//				.toList();
//
//		System.out.println(res);

//		String str = "helloworld";
//
//		// reverse the string using stream api
//		String reversed = stream(str.split(""))
//				.reduce( "", (s1, s2) -> s2 + s1);
//		System.out.println(reversed);

//		List<misc.Employee> employees = Arrays.asList(
//				new misc.Employee("John", 25, 50000),
//				new misc.Employee("Alice", 32, 60000),
//				new misc.Employee("Bob", 35, 70000),
//				new misc.Employee("Charlie", 32, 65000),
//				new misc.Employee("David", 40, 80000),
//				new misc.Employee("Eve", 35, 75000)
//		);
//
//		Map<Integer, Double> avgByAge = employees.stream()
//				.filter(emp -> emp.getAge() > 30)
//				.collect(Collectors.groupingBy(misc.Employee::getAge,
//						Collectors.averagingDouble(misc.Employee::getSalary)));

		List<Employee> employees = Arrays.asList(
				new Employee("John", 25, 50000, "HR"),
				new Employee("Alice", 32, 60000, "IT"),
				new Employee("Bob", 35, 70000, "IT"),
				new Employee("Charlie", 32, 65000, "Finance"),
				new Employee("David", 40, 80000, "Finance"),
				new Employee("Eve", 35, 75000, "HR")
		);

//		employees.stream()
//				.sorted(Comparator.comparing(misc.Employee::getSalary).reversed())
//				.limit(3)
//				.forEach(emp -> System.out.println(emp.getName() + ": " + emp.getSalary()));

//		employees.stream()
//				.filter(employee -> employee.getSalary() > employees.stream().mapToDouble(misc.Employee::getSalary).average().getAsDouble())
//				.forEach(emp -> System.out.println(emp.getName() + ": " + emp.getSalary()));

//		employees.stream()
//				.collect(Collectors.groupingBy(emp -> emp.getAge() / 10 * 10, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
//				.forEach((ageGroup, emp) -> System.out.println("Age Group " + ageGroup + ": " + emp.get().getName() + " with salary " + emp.get().getSalary()));


		employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
				.forEach((dept, emp) -> System.out.println("Department " + dept + ": " + emp.get().getName() + " with salary " + emp.get().getSalary()));

	}
}

class Employee {
	private String name;
	private int age;
	private double salary;
	private String department;

	// getters and setters
	public Employee( String name, int age, double salary, String department) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
}
