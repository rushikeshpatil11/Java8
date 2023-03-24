package com.prowings.onlineinterview;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 6, 8 };
		int[] b = { 1, 8, 4, 6, 2 };

		Arrays.sort(a);
		Arrays.sort(b);
		boolean result = Arrays.compare(a, b) == 0;
		System.out.println("The arrays are equal: " + result);

	}

}
