package com.prowings.interviewque;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_All_Even_Numbers_From_Given_List_Of_Integers {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		List<Integer> even = myList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out.println(even);
	}
}
