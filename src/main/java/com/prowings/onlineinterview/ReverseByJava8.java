package com.prowings.onlineinterview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseByJava8 {

	public static void main(String[] args) {

		// Reverse List
		List<Integer> l = Arrays.asList(2, 3, 5, 1, 6, 8, 9, 3);
		System.out.println("Original List => " + l);
		LinkedList<Integer> ll = new LinkedList<>();
		l.stream().forEach(e -> ll.addFirst(e));
		System.out.println("Reverse List => " + ll);

		System.out.println("<<<<<<<<<>>>>>>>>>>");
		// Reverse String
		String s = "Rushikesh";
		System.out.println("Original String => " + s);
		StringBuffer sb = new StringBuffer();
		s.chars().forEach(x -> sb.append((char) x));
		System.out.println("Reverse String => " + sb.reverse().toString());

	}

}
