package com.prowings.salimprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizingFirstCharacterFromEachWord {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "pqr", "xyz", "mnop");

		System.out.println("Original List => "+list);
		List<String> collect = list.stream()
				.map(s -> s.replaceFirst(s.substring(0, 1), s.substring(0, 1).toUpperCase()))
				.collect(Collectors.toList());
		System.out.println("After Opreation => "+collect);

	}
}
