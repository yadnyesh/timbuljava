package io.lamdas.udemy.durga.functionalinterface.Lecture44;

import java.util.function.Function;

public class FunctionChaining {
	
	public static void main(String[] args) {
		Function<String, String> toUpperCase = s -> s.toUpperCase();
		Function<String,String> firstNineChars = s -> s.substring(0, 9);
		
		System.out.println("User Functional Chaining: " + toUpperCase.andThen(firstNineChars).apply("kiaraadvani"));
	}
}
