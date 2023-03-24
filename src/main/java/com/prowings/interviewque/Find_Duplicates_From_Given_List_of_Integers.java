package com.prowings.interviewque;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_Duplicates_From_Given_List_of_Integers {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);	
		HashSet<Integer> h=new HashSet<>();
		Set<Integer> collect = myList.stream().filter(e->!h.add(e)).collect(Collectors.toSet());
		System.out.println(collect);
	}
}
