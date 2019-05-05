package io.lamdas.udemy.durga.functionalinterface.Lecture44;

import java.util.function.Function;

public class FunctionChaining {
	
	public static void main(String[] args) {
		Function<String, String> toUpperCase = s -> s.toUpperCase();
		Function<String,String> firstNineChars = s -> s.substring(0, 9);
		
		Function<String, String> functionIdentity = Function.identity();
		
		System.out.println("User Functional Chaining: " + toUpperCase.andThen(firstNineChars).apply("kiaraadvani"));
		System.out.println("Function Identity: " + functionIdentity.apply("Yadnyesh"));
	}
}
