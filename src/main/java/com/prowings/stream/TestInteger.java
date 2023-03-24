package com.prowings.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestInteger {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();

		for(int i=1;i<=10;i++)
			al.add(i);
		
		System.out.println(al);
		
		List<Integer> collect = al.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
	}
}
