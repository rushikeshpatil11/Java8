package com.prowings.interviewque;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_First_Non_Repeated_Character_From_Given_String {

	public static void main(String[] args) {
		String input = "Java Hungry Blog Alive is Awesome";
// Set<Character> chars = new HashSet();
//		 
//         Character result = input.chars() // Stream of String       
//                   .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
//                   .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
//                   .entrySet()
//                   .stream()
//                   .filter(entry -> entry.getValue() == 1L)
//                   .map(entry -> entry.getKey())
//                   .findFirst()
//                   .get();
//         System.out.println(result+"\n\n\n"); 

		char[] charArray = input.toLowerCase().toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int count = 0;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j])
					count++;
			}
			if (count == 0) {
				System.out.println(charArray[i]);
				break;
			}
		}
		
		List<String> asList = Arrays.asList(input.toLowerCase().split(""));
		String string = asList.stream().filter(e->Collections.frequency(asList, e)==1).findFirst().get();
		System.out.println(string);
		
		
	}
}
