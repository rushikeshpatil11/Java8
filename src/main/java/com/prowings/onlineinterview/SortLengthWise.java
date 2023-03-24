package com.prowings.onlineinterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortLengthWise {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("A","B","ABC","AAAA","BBBB","CCCCC");
		
		Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
	}

}
