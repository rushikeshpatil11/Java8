package com.prowings.onlineinterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapByValueAndKey {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("apple", 5);
		map.put("banana", 2);
		map.put("orange", 4);
		map.put("pear", 3);

		System.out.println("Original Map =>" + map);

		LinkedHashMap<String, Integer> key = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
		System.out.println("ComparingByKey => " + key);

		LinkedHashMap<String, Integer> value = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> x, LinkedHashMap::new));

		System.out.println("ComparingByValue => " + value);

		// Without Java 8
		ArrayList<Entry<String, Integer>> a = new ArrayList<>(map.entrySet());
		System.out.println(a);

		Collections.sort(a, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		System.out.println(a);

		System.out.println(15 * 30 + "ABC");
		System.out.println("ABC" + 15 * 30);
		
		
		
	}

}
