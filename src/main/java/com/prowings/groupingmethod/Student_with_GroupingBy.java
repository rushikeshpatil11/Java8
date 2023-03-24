package com.prowings.groupingmethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Student_with_GroupingBy {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Math", "John", "Smith", "Miami", 19),
				new Student("Programming", "Mike", "Miles", "New York", 21),
				new Student("Math", "Michael", "Peterson", "New York", 20),
				new Student("Math", "James", "Robertson", "Miami", 20),
				new Student("Programming", "Kyle", "Miller", "Miami", 20));

		Map<String, List<Student>> collect = students.stream().collect(Collectors.groupingBy(Student::getSubject));
		System.out.println("Student By Subject => " + collect);

		Map<String, List<Student>> collect2 = students.stream().collect(Collectors.groupingBy(Student::getCity));
		System.out.println("Student By City => " + collect2);

		Map<Integer, Long> collect3 = students.stream()
				.collect(Collectors.groupingBy(Student::getAge, Collectors.counting()));
		System.out.println("Student Count By Age =>" + collect3);

		Map<String, Long> collect4 = students.stream()
				.collect(Collectors.groupingBy(Student::getSubject, Collectors.counting()));
		System.out.println("Student Count By Subject => " + collect4);

		TreeMap collect5 = students.stream().collect(Collectors.groupingBy(Student::getCity,
				() -> new TreeMap(Collections.reverseOrder()), Collectors.counting()));
		System.out.println("Student Count By City In Ascending Order => " + collect5);
	}
}
