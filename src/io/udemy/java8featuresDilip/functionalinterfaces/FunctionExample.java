package io.udemy.java8featuresDilip.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {
	
	static Function<String, String> firstFunction = (name) -> name.toUpperCase();
	
	static Function<String, String> addDefaultString = (name) -> name.toUpperCase().concat(" is great!");
	
	public static void main(String[] args) {
		
		System.out.println("Result is : " + addDefaultString.apply("yadnyesh"));
	
	}
}
