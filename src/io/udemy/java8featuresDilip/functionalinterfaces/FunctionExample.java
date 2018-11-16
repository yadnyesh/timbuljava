package io.udemy.java8featuresDilip.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {
	
	static Function<String, String> firstFunction = (name) -> name.toUpperCase();
	
	public static void main(String[] args) {
		
		System.out.println("Result is : " + firstFunction.apply("yadnyesh"));
	
	}
}
