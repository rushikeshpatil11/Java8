package com.prowings.onlineinterview;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		Random r=new Random();
		
		r.ints(1,100).limit(10).sorted().forEach(System.out::println);
	}

}
