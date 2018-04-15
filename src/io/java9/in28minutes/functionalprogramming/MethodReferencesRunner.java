package io.java9.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {
	
	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Element")
				.stream()
				.map(String::length)
				.forEach(System.out::println);
	}
}
