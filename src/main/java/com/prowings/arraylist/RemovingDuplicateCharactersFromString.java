package com.prowings.arraylist;

public class RemovingDuplicateCharactersFromString {

	public static void main(String[] args) {
		String str = "programming";
		StringBuffer ab=new StringBuffer();
		str.chars().distinct().forEach(s->System.out.print((char)s));
		System.out.println();
		str.chars().distinct().forEach(s->ab.append((char)s));
		System.out.println(ab);
	}
}
