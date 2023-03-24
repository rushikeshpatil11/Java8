package com.prowings.onlineinterview;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 2 };
		int[] b = { 1, 6, 7, 2, 1 };

		Set<Integer> collect = Arrays.stream(a).filter(x -> Arrays.stream(b).anyMatch(y -> y == x)).boxed()
				.collect(Collectors.toSet());
		System.out.println(collect);
	}

}
