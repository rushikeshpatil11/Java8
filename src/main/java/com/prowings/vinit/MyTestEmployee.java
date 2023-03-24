package com.prowings.vinit;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MyTestEmployee {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();

		l.add(new Employee(12, "Shahaji", "Kolhapur", 100000, "Male"));
		l.add(new Employee(2, "Shantabai", "Mumbai", 9000, "Female"));
		l.add(new Employee(192, "Ram", "Kolhapur", 120000, "Male"));
		l.add(new Employee(1622, "Tatya", "Karad", 1550000, "Male"));
		l.add(new Employee(312, "Tokiyo", "Kolhapur", 10000, "Female"));
		l.add(new Employee(87, "Rajaram", "Satara", 550000, "Male"));
		l.add(new Employee(92, "Hajam", "Karad", 120000, "Male"));
		l.add(new Employee(100, "Bhiku Mahatre", "Kolhapur", 100000, "Male"));
		l.add(new Employee(07, "Priya", "Pune", 5000, "Female"));

		// Max salary
		System.out.println("--------------------Max salary----------------");
		Employee empmax = l.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(empmax);
		System.out.println();

		// 2 nd max salary
		System.out.println("--------------------2 nd max salary----------------");
		Employee emp2max = l.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1)
				.findFirst().get();
		System.out.println(emp2max);
		System.out.println();

		// Min salary
		System.out.println("--------------------Min salary----------------");
		Employee empmin = l.stream().min(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(empmin);
		System.out.println();

		// 2 nd min salary
		System.out.println("--------------------2 nd min salary----------------");
		Employee emp2min = l.stream().sorted(Comparator.comparingInt(Employee::getSalary)).skip(1).findFirst().get();
		System.out.println(emp2min);
		System.out.println();

		// get city
		System.out.println("--------------------get city----------------");
		List<Employee> collect = l.stream().filter(e -> e.getCity().equals("Kolhapur")).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println();

		// Kolhapur With Min Salary
		System.out.println("--------------------get city with min salary----------------");
		Employee empcityandminsal = l.stream().filter(e -> e.getCity().equals("Kolhapur"))
				.min(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(empcityandminsal);
		System.out.println();

		// Kolhapur With Max Salary
		System.out.println("--------------------get city with max salary----------------");
		Employee empcitymaxsal = l.stream().filter(e -> e.getCity().equals("Kolhapur"))
				.max(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(empcitymaxsal);
		System.out.println();

		// Kolhapur With 2nd Max Salary
		System.out.println("--------------------get city with 2nd max salary----------------");
		Employee empcity2max = l.stream().filter(e -> e.getCity().equals("Kolhapur"))
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst().get();
		System.out.println(empcity2max);
		System.out.println();

		// only male
		System.out.println("--------------------only male----------------");
		List<Employee> maleemp = l.stream().filter(e -> e.getGender().equals("Male")).collect(Collectors.toList());
		System.out.println(maleemp);
		System.out.println();

		// salary wise sort employee
		System.out.println("--------------------salary wise sort employee----------------");
		List<Employee> salwisesort = l.stream().sorted(Comparator.comparingInt(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(salwisesort);
		System.out.println();

		// name wise sort employee
		System.out.println("--------------------name wise sort employee----------------");
		List<Employee> namewisesort = l.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(namewisesort);
		System.out.println();

		// id wise sort employee
		System.out.println("--------------------id wise sort employee----------------");
		List<Employee> idwisesort = l.stream().sorted(Comparator.comparingInt(Employee::getId))
				.collect(Collectors.toList());
		System.out.println(idwisesort);
		System.out.println();

		// to get id is greter than 50
		System.out.println("--------------------to get id is greter than 50----------------");
		List<Employee> idgt50 = l.stream().filter(e -> e.getId() >= 50).collect(Collectors.toList());
		System.out.println(idgt50);
		System.out.println();

		// only to get a data
		System.out.println("--------------------only to get a data----------------");
		List<Employee> data = l.stream().collect(Collectors.toList());
		System.out.println(data);
		System.out.println();

		// pirticular city salary is greter than
		System.out.println("--------------------pirticular city salary is greter than----------------");
		List<Employee> cityandsal = l.stream().filter(e -> e.getCity().equals("Kolhapur"))
				.filter(e -> e.getSalary() < 12000).collect(Collectors.toList());
		System.out.println(cityandsal);
		System.out.println();

		// pirticular name using contains & equalsIgnoreCase methods
		System.out.println(
				"--------------------pirticular name using contains & equalsIgnoreCase methods----------------");
		List<Employee> conteql = l.stream().filter(e -> e.getName().contentEquals("Tokiyo"))
				.collect(Collectors.toList());
		System.out.println(conteql);
		System.out.println();

		List<Employee> eqling = l.stream().filter(e -> e.getName().equalsIgnoreCase("Tokiyo"))
				.collect(Collectors.toList());
		System.out.println(eqling);
		System.out.println();

		// increase salary which id >=100
		System.out.println("--------------------increase salary which id >=100----------------");
//				l.stream().filter(e->e.getId()>=100).map(e->e.setSalary(e.getSalary()+1000)).

		List<Double> model = l.stream().filter(i -> i.getId() >= 100).map(s -> s.getSalary() * 1.10)
				.collect(Collectors.toList());
		System.out.println(model);

		// sum of given numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		Integer reduce = numbers.stream().reduce((e1, e2) -> e1 + e2).get();
		System.out.println(reduce);

		System.out.println("Sum: " + sum);

		// next wend
		LocalDate now = LocalDate.now();
		LocalDate nextWednesday = now.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println(nextWednesday);
	}

}
