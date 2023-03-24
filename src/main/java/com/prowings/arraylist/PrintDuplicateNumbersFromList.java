package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumbersFromList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			list.add(i);

			if (i == 5)
				list.add(i - 1);
			if (i == 7)
				list.add(i - 1);
			if (i == 2)
				list.add(i - 1);
			if (i == 9)
				list.add(i - 1);
			if (i == 5)
				list.add(i - 1);
			if (i == 7)
				list.add(i - 1);
			if (i == 2)
				list.add(i - 1);
			if (i == 9)
				list.add(i - 1);
		}
		System.out.println(list);
		HashSet<Integer> s=new HashSet<>();
		Set<Integer> collect = list.stream().filter(i->!s.add(i)).collect(Collectors.toSet());
		System.out.println(collect);
	}
}
