package com.prowings.interviewque;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_the_Number_Starting_with_1 {

	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		 List<Integer> collect = myList.stream().filter(s->String.valueOf(s).startsWith("1")).collect(Collectors.toList());
		 System.out.println(collect);
		 
		 
			
	}
}
