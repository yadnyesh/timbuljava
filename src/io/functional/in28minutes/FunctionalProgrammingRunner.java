package io.functional.in28minutes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingRunner {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Banana", "Cat", "Dog");
		printBasic(list);
	}
	
	private static void printBasic(List<String> list) {
		list.stream().forEach(System.out::println);
	}
}
