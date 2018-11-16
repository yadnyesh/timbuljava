package io.udemy.java8featuresDilip.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {
	
	static Function<String, String> firstFunction = (name) -> name.toUpperCase();
	
	static Function<String, String> addDefaultString = (name) -> name.toUpperCase().concat(" is great!");
	
	public static void main(String[] args) {
		
		System.out.println("Result is : " + addDefaultString.apply("yadnyesh"));
		System.out.println("Result of compose is: " + firstFunction.compose(addDefaultString).apply("yadnyesh"));
		System.out.println("Result of first compose is: " + addDefaultString.compose(firstFunction).apply("yadnyesh"));
		System.out.println("Result of andThen is: " + addDefaultString.andThen(firstFunction).apply("yadnyesh"));
		
	
	}
}
