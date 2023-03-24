package com.prowings.vinit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyJava8 {
	public static void main(String[] args) {

		// find max number in int type array
		System.out.println("-----------------Find the Max.No. in array---------------------");
		int a[] = { 12, 50, 567, 34, 54, 90, 34 };
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println(max);
		System.out.println();

		// find number start with 1
		System.out.println("-----------------find integer start with 1---------------------");
		Integer a1[] = { 517, 34, 23, 4856, 98, 90, 189, 12, 1234 };
		System.out.println("Ori=>"+a1);
		List<Integer> startwith1 = Arrays.stream(a1).filter(e -> String.valueOf(e).startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(startwith1);
		System.out.println();

		// Map methode example
		System.out.println("-----------------Map methode example---------------------");
		List<String> pp = new ArrayList<>();
		pp.add("Ram");
		pp.add("Sham");
		pp.add("Gopal");
		pp.add("Pream");
		List<Integer> length = pp.stream().map(e -> e.length()).collect(Collectors.toList());
		System.out.println(length);
		System.out.println();

		// Flat Map methode example
		System.out.println("-----------------Flat Map methode example---------------------");
		List<String> l1 = Arrays.asList("Pandu", "Dnandu", "Sham");
		List<String> l2 = Arrays.asList("Sham", "Tejai", "Pream");
		List<String> l3 = Arrays.asList("Gopal", "Dhanaji", "Jonh");

		List<List<String>> allList = new ArrayList<List<String>>();
		allList.add(l1);
		allList.add(l2);
		allList.add(l3);

		List<String> flatmap = allList.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
		System.out.println(flatmap);
		System.out.println();

		// print array in reverse order using java 8
		System.out.println("-----------------print array in reverse order using java 8---------------------");
		List<Integer> rev = Arrays.stream(a1).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Rev =>"+rev);
		System.out.println();

		int[] array = IntStream.range(0, a1.length).map(e -> a1[a1.length - e - 1]).toArray();
		System.out.println(Arrays.toString(array));
		System.out.println();

		// find 2nd max no in array using java 8
		System.out.println("-----------------find 2nd max no in array using java 8---------------------");
		Integer max2 = Arrays.stream(a1).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(max2);
		System.out.println();

		// find 3rd max no in array using java 8
		System.out.println("-----------------find 3rd max no in array using java 8---------------------");
		Integer max3 = Arrays.stream(a1).sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(max3);
		System.out.println();

		// Count of duplicate in List
		System.out.println("-----------------Count of duplicate in List---------------------");
		List<Integer> count = Arrays.asList(12, 13, 12, 13, 3, 45, 67, 98, 34);
		HashSet<Integer> h=new HashSet<>();
		List<Integer> duplicate = count.stream().filter(e->!h.add(e)).collect(Collectors.toList());
		System.out.println(duplicate);
		
		LinkedHashMap<Integer, Long> counting = count.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(">>>>>"+counting);
		System.out.println();
		
		
		System.out.println("-----------------Print vovels in String---------------------");
		String string = "vint salokhe";
		String vovels = string.replaceAll("[^a,e,i,o,u]", "");
		System.out.println(vovels);
		System.out.println(vovels.length());
		
		
		System.out.println("-----------------number starts with 1---------------------");
		List<Integer> findNoStartWith = Arrays.asList(1, 13, 45, 7, 52, 14, 64, 14, 660, 76, 1, 13);
		
		List<Integer> collect = findNoStartWith.stream().filter(e->(String.valueOf(e).startsWith("1"))).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println();
		
		
		System.out.println("-----------------Print duplicate in list---------------------");
		List<Integer> list1 = Arrays.asList(1, 2, 1, 2, 36, 74, 875, 35, 74, 9, 3, 16);
		HashSet<Integer> h1=new HashSet();
		
		List<Integer> collect2 = list1.stream().filter(e->!h1.add(e)).collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println();
		
		System.out.println("-----------------Max Number---------------------");
		List<Integer> list3 = Arrays.asList(1, 2, 24, 4, 68, 90, 2446, 954, 24);
		
		Integer integer = list3.stream().max((e1,e2)->e1.compareTo(e2)).get();
		System.out.println(integer);
		System.out.println();
		
		System.out.println("-----------------first non-repeated character---------------------");
		String s = "Java is a programming laungauge";
		List<String> l=Arrays.asList(s.toLowerCase().split(""));
		String string2 = l.stream().filter(e->Collections.frequency(l,e)==1 && !e.equals(" ")).findFirst().get();
		System.out.println(string2);
		System.out.println();
		
		System.out.println("-----------------first repeated character---------------------");
		String input = "Java Hungry Blog Alive is Awesome";
		List<String> asList = Arrays.asList(input.toLowerCase().split(""));
		String string3 = asList.stream().filter(e->Collections.frequency(asList, e)!=1 && !e.equals(" ")).findFirst().get();
		System.out.println(string3);
		System.out.println();
	}

}
