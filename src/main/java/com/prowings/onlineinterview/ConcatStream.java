package com.prowings.onlineinterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStream {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> l2 = Arrays.asList(10, 9, 8, 5, 6, 7);

		Stream<Integer> concat = Stream.concat(l1.stream(), l2.stream());
		List<Integer> all = concat.collect(Collectors.toList());
		System.out.println("All Elements => " + all);

		List<Integer> uni = all.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Elements => " + uni);

		List<Integer> sort = uni.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Elements =>" + sort);

		Integer max = sort.stream().max((e1, e2) -> e1.compareTo(e2)).get();
		System.out.println("Max Element => " + max);
	}

}
