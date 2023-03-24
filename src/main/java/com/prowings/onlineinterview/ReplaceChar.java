package com.prowings.onlineinterview;

public class ReplaceChar {

	public static void main(String[] args) {

		// 1
		String s = "Rushikesh";
		String rep = s.replace("h", "");
		System.out.println(rep);

		// 2
		String a = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'h')
				a = a + s.charAt(i);
		}
		System.out.println(a);

		// 3 check digit
		// a
		int i = 1234;
		int d1 = Integer.toString(i).length();
		System.out.println(d1);

		// b
		int d2 = String.valueOf(i).length();
		System.out.println(d2);
	}
}
