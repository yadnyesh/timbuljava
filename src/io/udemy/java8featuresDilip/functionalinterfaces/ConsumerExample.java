package io.udemy.java8featuresDilip.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		Consumer<String> consumerString = (s) -> System.out.println(s.toUpperCase());
		consumerString.accept("yadnyesh");
		
	}
}
