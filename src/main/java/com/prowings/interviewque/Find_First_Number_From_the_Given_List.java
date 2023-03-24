package com.prowings.interviewque;

import java.util.Arrays;
import java.util.List;

public class Find_First_Number_From_the_Given_List {
	
	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 Integer integer = myList.stream().findFirst().get();
		 System.out.println(integer);
		 
	}

}
