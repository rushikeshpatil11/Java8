package com.prowings.onlineinterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToInteger {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1", "2", "3", "4", "5");
		System.out.println(list);
		List<Integer> list1 = list.stream().map(e -> (Integer.valueOf(e))).collect(Collectors.toList());
		System.out.println(list1);
	}

}
