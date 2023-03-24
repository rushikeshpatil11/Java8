package com.prowings.vinit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class KanadeSirIntegerListProgram {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 3, 1, 2, 5, 6, 7);
		// 61
		List<Integer> even = l.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		// 62
		List<Integer> st1 = l.stream().filter(e -> String.valueOf(e).startsWith("1")).collect(Collectors.toList());
		System.out.println(st1);

		// 63
		HashSet<Integer> h = new HashSet<>();
		List<Integer> dupli = l.stream().filter(e -> !h.add(e)).collect(Collectors.toList());
		System.out.println(dupli);

		// 64
		Integer first = l.stream().findFirst().get();
		System.out.println(first);

		// 65
		long count = l.stream().count();
		System.out.println(count);
		
		// 66
		Integer max = l.stream().max((e1,e2)->e1.compareTo(e2)).get();
		System.out.println(max);
		
		// 69
		List<Integer> sorted = l.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		// 70
		List<Integer> desc = l.stream().sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
		System.out.println(desc);
		
		System.out.println("original"+l);
		
		
		
		
	}

}
