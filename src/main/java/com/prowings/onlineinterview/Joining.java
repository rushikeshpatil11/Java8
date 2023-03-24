package com.prowings.onlineinterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(2, 3, 5, 1, 6, 8, 9, 3);

		String collect = l.stream().map(e -> String.valueOf(e)).collect(Collectors.joining("*"));
		System.out.println(collect);

	}

}
