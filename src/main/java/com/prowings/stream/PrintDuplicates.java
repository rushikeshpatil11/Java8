package com.prowings.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicates {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		al.add(23);
		al.add(24);
		al.add(27);
		al.add(24);
		al.add(25);
		al.add(23);
		
		List<Integer> uni = al.stream().distinct().collect(Collectors.toList());
		System.out.println(uni);
		
		Set<Integer> s=new HashSet();
		List<Integer> dupli = al.stream().filter(e->!s.add(e)).collect(Collectors.toList());
		System.out.println(dupli);
		
		
	}

}
