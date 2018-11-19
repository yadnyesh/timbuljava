package io.udemy.java8featuresDilip.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	
	static UnaryOperator<String> stringUnaryOperator = (s) -> s.concat(" Default String");
	
	public static void main(String[] args) {
		System.out.printf(stringUnaryOperator.apply("java 8"));
	}

}
