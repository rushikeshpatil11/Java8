package com.prowings.vinit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyNewProgram {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("nitin");
		l.add("sachin");
		l.add("anup");
		l.add("ajay");

		System.out.println("---------------------record that start with 'a' in List------------------------");
		List<String> startwitha = l.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
		System.out.println(startwitha);
		System.out.println();

		System.out.println("---------------------(Assending)start with 'a' in List------------------------");
		List<String> startwithaascending = l.stream().filter(e -> e.startsWith("a")).sorted()
				.collect(Collectors.toList());
		System.out.println(startwithaascending);
		System.out.println();

		System.out.println("---------------------(Descending)starts with 'a' in List------------------------");
		List<String> startwithadecending = l.stream().filter(e -> e.startsWith("a")).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(startwithadecending);
		System.out.println();

		System.out.println(
				"---------------------make all upper case that starts with 'a' in List------------------------");
		List<String> upper = l.stream().filter(e -> e.startsWith("a")).map(e -> e.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(upper);
		System.out.println();

		System.out.println("---------------------any record starts with 'a' in List------------------------");
		boolean anyMatch = l.stream().anyMatch(e -> e.startsWith("a"));
		System.out.println(anyMatch);
		System.out.println();

		System.out.println("---------------------all record starts with 'a' in List------------------------");
		boolean allMatch = l.stream().allMatch(e -> e.startsWith("a"));
		System.out.println(allMatch);
		System.out.println();

		System.out.println("---------------------count records starts with 'a' in List------------------------");
		long count = l.stream().filter(e -> e.startsWith("a")).count();
		System.out.println(count);
		System.out.println();

		System.out.println("---------------------convert list of integer into stream------------------------");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		Stream<Integer> stream = list.stream();
		stream.forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();

		System.out.println("---------------------convert list of String into stream------------------------");
		List<String> list1 = Arrays.asList("ram", "sham", "pream", "gopal");
		Stream<String> stream2 = list1.stream();
		stream2.forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();

		System.out.println("---------------------Total addition of array or list------------------------");
		List<Integer> ll = new ArrayList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		Integer integer = ll.stream().reduce((x, y) -> x + y).get();
		System.out.println(integer);
		System.out.println();
		// OR
		Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer integer2 = Arrays.stream(a).reduce((x, y) -> x + y).get();
		System.out.println(integer2);
		System.out.println();

		System.out.println("---------------------Create stream object------------------------");
		Stream<String> s = Stream.of("Gaurav", "Salim", "Omkar", "Vishal");
		s.forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();

		System.out.println("---------------------find even no is greter than 20------------------------");
		Integer b[] = { 1, 23, 5, 6, 2, 75, 80 };
		List<Integer> evenNo = Arrays.stream(b).filter(e -> e % 2 == 0).filter(e -> e > 20)
				.collect(Collectors.toList());
		System.out.println(evenNo);
		System.out.println();

		System.out.println("---------------------max no------------------------");
		Integer max1 = Arrays.stream(b).max((e1, e2) -> e1.compareTo(e2)).get();
		System.out.println(max1);
		System.out.println();
		Integer max2 = ll.stream().max((e1, e2) -> e1.compareTo(e2)).get();
		System.out.println(max2);

	}

}
