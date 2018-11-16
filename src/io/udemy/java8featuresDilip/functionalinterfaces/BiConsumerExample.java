package io.udemy.java8featuresDilip.functionalinterfaces;

import io.udemy.java8featuresDilip.data.Student;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	
	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("a: " + a + " b: " + b);
		biConsumer.accept("yadnyesh", "bharatjuvekar");
	}
	
}
