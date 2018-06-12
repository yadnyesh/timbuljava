package io.java9.in28minutes.functionalprogramming;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
//		List<String> list = List.of("Appple", "Orange", "Banana", "Cat", "Dog", "Bat");
//		printWithFPFiltering(list);
//
//		List<Integer> numbers = List.of(1,2,3,4,5,6,789,232);
//		numbers.stream().forEach(element -> System.out.println(element));
//		System.out.println(numbers
//							.stream()
//							.filter(element -> element%2 ==1)
//							.reduce(0,
//									(number1, number2) ->
//										{
//											System.out.println(number1 + " " + number2);
//											return number1 + number2;
//										}
//									)
//						  );
//		System.out.println(numbers.stream().max((n1,n2) -> Integer.compare(n1,n2)).get());
//		System.out.println(numbers.stream().filter(e -> e%2 == 0).collect(Collectors.toList()));
//		System.out.println(IntStream.range(1,11).map(e -> e*e).boxed().collect(Collectors.toList()));
	}
}
