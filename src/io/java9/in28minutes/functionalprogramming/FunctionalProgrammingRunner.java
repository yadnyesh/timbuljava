package io.java9.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {
	
	private static void printWithFP(List<String> list){
		list.stream().forEach(element -> System.out.println(element));
	}
	
	public static void main(String[] args) {
		List<String> list = List.of("Appple", "Orange", "Banana", "Cat", "Dog");
		printWithFP(list);
	}
}
