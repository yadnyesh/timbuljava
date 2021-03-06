package io.lamdas.udemy.durga.functionalinterface;

import java.util.function.Function;

public class FunctionalInterface {
	
	public static void main(String[] args) {
		Function<String, Integer> stringIntegerFunction = s -> s.length();
		System.out.println("Using Functional Predicate: " + stringIntegerFunction.apply("yadnyesh"));
		
		Function<Integer, Integer> returnSquareFunction = i -> i * i;
		System.out.println("Square of the number " + 5 + " is: " + returnSquareFunction.apply(5));
	}
}
