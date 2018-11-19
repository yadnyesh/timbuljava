package io.udemy.java8featuresDilip.functionalinterfaces;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
	
	static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
	
	static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;
	
	
	public static void main(String[] args) {
		System.out.println("Using Lambda: " + toUpperCaseLambda.apply("Yadnyesh"));
		System.out.println("Using Method Reference: " + toUpperCaseLambda.apply("Yadnyesh"));
		
	}

}
