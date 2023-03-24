package com.prowings.onlineinterview;

public class BasicProgram {

	public static void main(String[] args) {

		// 1 find special char
		String s = "rushi@a!";
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				System.out.println(s.charAt(i));
			} else {
				s1 = s1 + (s.charAt(i));
			}
		}
		System.out.println(s1);

		// 2 divide into two parts

		String str = "This is India This is India";
		String in = str.substring(0, str.length() / 2).toLowerCase();
		String out = str.substring(str.length() / 2).toUpperCase();
		System.out.println(in);
		System.out.println(out);

		// 3 Rotation of String

		String a = "ABCD";
		String b = "CDAF";

		boolean res1 = (a + a).indexOf(b) != -1;
		System.out.println(res1);

		// 4 Find Missing Number

		int num[] = { 1, 2, 4, 9, 10, 8, 7, 5, 6 };
		int suma = 0;
		int sumb = 0;
		for (int i = 0; i < num.length; i++)
			suma = suma + num[i];

//		for (int i = 0; i <= 10; i++)
//			sumb = sumb + i;
		sumb=(10*11)/2;

		System.out.println("Missing digit =" + (sumb - suma));

	}
}
