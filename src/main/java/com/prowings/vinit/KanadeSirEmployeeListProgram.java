package com.prowings.vinit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class KanadeSirEmployeeListProgram {

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
		l.add(new Employee(07, "Priya", "Pune", 5000000, "Female"));

		// 72
		List<Employee> e1 = l.stream().filter(e -> e.getSalary() >= 50000).collect(Collectors.toList());
		System.out.println(e1);

		// 73
		Integer collect = l.stream().collect(Collectors.summingInt(Employee::getSalary));
		System.out.println(collect);

		// 74
		Employee max = l.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(max);

		// 75
		Employee maxid = l.stream().max(Comparator.comparingInt(Employee::getId)).get();
		System.out.println(maxid);

		// 76
		l.stream().forEach(e -> e.setSalary(e.getSalary() + 10000));
		System.out.println(l);

		// 77
		l.stream().forEach(e -> e.setName(e.getName().toUpperCase()));
		System.out.println(l);

		// 78
		String input = "Java Hungry Blog Alive is Awesome";
		Map<IntStream, Long> occ = Stream.of(input.chars())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(occ);

		// 81
		Map<String, List<Employee>> collect2 = l.stream().collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(collect2);

		// 83
		Double collect3 = l.stream().collect(Collectors.averagingInt(Employee::getSalary));
		System.out.println(collect3);

		// 84
		Map<String, Double> collect4 = l.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getSalary)));
		System.out.println(collect4);

		// 97
		String collect5 = l.stream().map(Employee::toString).collect(Collectors.joining(" , "));
		System.out.println(collect5);

		// 100
		Employee last = l.stream().reduce((first, second) -> second).orElse(null);
		System.out.println(last);

		// 102
		String s = "abcdfegssavcb";
		LinkedHashMap<String, Long> collect6 = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()));
		System.out.println(collect6);

		// 103
		StringBuffer sb = new StringBuffer();
		s.chars().forEach(e -> sb.append((char) e));
		System.out.println(sb.reverse());

		// 104
		collect6.entrySet().stream().forEach(e -> System.out.print(e.getKey() + " " + e.getValue()));
		System.out.println();

		List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Integer integer = numberList.stream().reduce((x, y) -> x + y).get();
		System.out.println(integer);

		int[] numbers = { 1, 2, 3, 4, 5 };
		List<Integer> number = Arrays.stream(numbers).boxed().collect(Collectors.toList());

		int[] num = { 5, 2, 7, 1, 8 };
		Object[] array = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).toArray();
		System.out.println(Arrays.toString(array));

		// 129
		List<String> words = Arrays.asList("hello", "world", "hello", "java", "world", "java", "java");
		Map<String, Long> collect7 = words.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect7.entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);

		// 130
		Map<String, Long> collect8 = l.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect8);

		// 131
		l.stream().forEach(e -> System.out.println(e.getCity()));

		// 132
		Map<String, Double> collect9 = l.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getSalary)));
		System.out.println(collect9);

		// 133
		Employee employee = l.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(employee);

		// 134
		l.stream().filter(e -> e.getId() > 200).forEach(e -> System.out.println(e.getName()));

		// 135
		Map<String, Long> collect10 = l.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect10);

		// 137
		Employee employee2 = l.stream().filter(e -> e.getCity().equals("Kolhapur"))
				.min(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(employee2);

		// 142
		long longValue = l.stream().collect(Collectors.averagingInt(Employee::getSalary)).longValue();
		System.out.println(longValue);

		int intValue = l.stream().collect(Collectors.summingInt(Employee::getSalary)).intValue();
		System.out.println(intValue);
		System.out.println(l.size());
		
		// 
		List<Integer> collect11 = l.stream().filter(x->x.getId()%2==0).map(e->e.getId()).collect(Collectors.toList());
		System.out.println(collect11);
	}

}
