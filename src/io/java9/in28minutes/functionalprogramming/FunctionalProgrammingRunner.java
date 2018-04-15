package io.java9.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {
	
	private static void printWithFP(List<String> list){
		list.stream().forEach(element -> System.out.println("element -> " + element));
	}
	
	private static void printWithFPFiltering(List<String> list){
		list.stream()
				.filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("element -> " + element));
	}
	
	public static void main(String[] args) {
		List<String> list = List.of("Appple", "Orange", "Banana", "Cat", "Dog", "Bat");
		printWithFPFiltering(list);
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,789,232);
		numbers.stream().forEach(element -> System.out.println(element));
		System.out.println(numbers.stream().reduce(0, (number1, number2) -> number1 + number2));
	}
}
