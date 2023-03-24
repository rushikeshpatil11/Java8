package com.prowings.interviewque;

import java.util.Arrays;
import java.util.List;

public class Count_the_Number_of_Elements_Present_in_List {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		long count = myList.stream().count();
		int size = myList.size();
		System.out.println(count);
		System.out.println(size);
		
	}
}
