package io.java9.in28minutes;

import java.sql.SQLOutput;

public class BiNumberRunner {
	
	
	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(4,5);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
	}
}
