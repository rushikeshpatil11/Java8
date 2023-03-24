package com.prowings.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList();
		al.add(new Employee(1, "AA", "Dev", 200));
		al.add(new Employee(2, "ZZ", "Test", 100));
		al.add(new Employee(3, "DD", "Dev", 300));
		al.add(new Employee(4, "BB", "Test", 500));
		al.add(new Employee(5, "FF", "Dev", 400));

		System.out.println(al);

		// Find Employee By Dept
		System.out.println();
		System.out.println("FindEmployeeByDept :");
		List<Employee> l1 = al.stream().filter(e -> e.dept == "Dev").collect(Collectors.toList());
		l1.stream().forEach(System.out::println);

		// Find Employee By Salary
		System.out.println();
		System.out.println("FindEmployeeBySalaryGreaterThan :");
		List<Employee> l2 = al.stream().filter(e -> e.salary > 300).collect(Collectors.toList());
		l2.stream().forEach(System.out::println);

		// Count the Dev Dept Employee
		System.out.println();
		long count = al.stream().filter(e -> e.dept == "Dev").count();
		System.out.println("CountOfEmpOfParticulerDept :" + count);

		// Find Unique Dept Only
		System.out.println();
		List<String> unidept = al.stream().map(Employee::getDept).distinct().collect(Collectors.toList());
		System.out.println("UniqueDept :" + unidept);

		// Sort Employee By Salary
//		 Ascending = (e1,e2)->e1.salary<e2.salary?-1:e1.salary>e2.salary?1:0 ,
//		 e1.salary.compareTo(e2.salary)
//		 Decending = (e1,e2)->e1.salary<e2.salary?+1:e1.salary>e2.salary?-1:0 ,
//		 -e1.salary.compareTo(e2.salary)
		System.out.println();
		// List<Employee> sorted =
		// al.stream().sorted((e1,e2)->e1.salary<e2.salary?-1:e1.salary>e2.salary?1:0).collect(Collectors.toList());
		List<Employee> sorted = al.stream().sorted((e1, e2) -> -e1.salary.compareTo(e2.salary))
				.collect(Collectors.toList());
		System.out.println("SortedBySalary :" + sorted);

		// Find Min Salary Employee
		System.out.println();
		Employee minsal = al.stream().min((e1, e2) -> e1.salary.compareTo(e2.salary)).get();
		System.out.println("FindMinSalary :" + minsal);

		// Find Min Salary Employee
		System.out.println();
		Employee maxsal = al.stream().max((e1, e2) -> e1.salary.compareTo(e2.salary)).get();
		System.out.println("FindMaxSalary :" + maxsal);

		// IncrementSalaryOfEmpBy=5%
//		System.out.println();
//		List<Employee> incresal = al.stream().map(e -> {
//			e.setSalary(e.getSalary() * 5);
//			return e;
//		}).collect(Collectors.toList());
//		System.out.println("IncrementSalaryByEmployee :" + incresal);

		// Find Second Max Salary
		System.out.println();
		Employee max = al.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1)
				.findFirst().get();
		System.out.println(max);

		// Find Second min Salary
		System.out.println();
		Employee min = al.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst().get();
		System.out.println(min);

		// Find Max Salary
		Employee employee = al.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst()
				.get();
		System.out.println("Max Salary Employee =>" + employee);

		// Find Min Salary
		Employee employee2 = al.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).findFirst().get();
		System.out.println("Min Salary Employee =>" + employee2);

		// Count the number of each dept
		Map<String, Long> collect2 = al.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println(collect2);

		// Find Second Highest Salary
		List<Employees> e = new ArrayList<Employees>();

		e.add(new Employees(101, "Shubham", 21, 15000, "Java"));
		e.add(new Employees(101, "vaibhav", 23, 25000, "PHT"));
		e.add(new Employees(101, "Swapnil", 32, 35000, "C#"));
		e.add(new Employees(101, "Onkar", 22, 45000, "CPP"));
		e.add(new Employees(101, "Rohit", 35, 55000, "Python"));

		Employees employees = e.stream().sorted(Comparator.comparingDouble(Employees::getSalary).reversed()).skip(1).findFirst().get();
		
		System.out.println("Second Highest Salary =>" + employees.getSalary());

		// Make Capital only First Character
		List<String> list = Arrays.asList("abc", "pqr", "xyz", "mnop");

		List<String> str = list.stream().map(s -> s.toUpperCase().substring(0, 1).concat(s.substring(1)))
				.collect(Collectors.toList());

		List<String> collect3 = list.stream()
				.map(s -> s.replaceFirst(s.substring(0, 1), s.substring(0, 1).toUpperCase()))
				.collect(Collectors.toList());

		List<String> collect4 = list.stream().map(s -> new StringBuffer(s).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(collect4);
		System.out.println(str);
		System.out.println(collect3);

	}

}
