package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicatesNumbers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {

			list.add(i + 10);
			list.add(i + 10);
		}
		System.out.println(list);
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
