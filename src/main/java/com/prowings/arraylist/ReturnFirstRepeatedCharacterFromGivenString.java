package com.prowings.arraylist;

import java.util.Arrays;
import java.util.HashSet;

public class ReturnFirstRepeatedCharacterFromGivenString {

	public static void main(String[] args) {
		String str = "ZBACDFSVVYY";
		HashSet<Object> h=new HashSet<>();
		  String string = Arrays.stream(str.split("")).filter(e->!h.add(e)).findFirst().get();
		System.out.println(string);
		
	}
}
