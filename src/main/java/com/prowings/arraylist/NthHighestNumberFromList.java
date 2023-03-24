package com.prowings.arraylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NthHighestNumberFromList {

	// 5th Highest
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Integer integer = myList.stream().sorted().skip(4).findFirst().get();
		System.out.println(integer);
	}
}
