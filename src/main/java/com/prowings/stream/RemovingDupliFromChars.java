package com.prowings.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemovingDupliFromChars {
	
	public static void main(String[] args) {
		String s="communication";
		List<String> collect = Arrays.stream(s.split("")).distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		
		List<Student> students = Arrays.asList(
			    new Student("Math", "John", "Smith", "Miami", 19),
			    new Student("Programming", "Mike", "Miles", "New York", 21),
			    new Student("Math", "Michael", "Peterson", "New York", 20),
			    new Student("Math", "James", "Robertson", "Miami", 20),
			    new Student("Programming", "Kyle", "Miller", "Miami", 20)
			);
		
		Map<String, List<Student>> studentsBySubject = students
			    .stream()
			    .collect(
			    Collectors.groupingBy((Student::getSubject))
			    );
		System.out.println("sorting/grouping student by subjects are...");
		System.out.println("studentsBySubject : "+studentsBySubject+"\n\n");
	}

}
