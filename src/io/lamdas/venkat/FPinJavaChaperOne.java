package io.lamdas.venkat;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FPinJavaChaperOne {
	
	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		friends.forEach(System.out::println);
		friends.stream().map(String::toUpperCase)
		.forEach(System.out::println);
		friends.stream().map(String::length)
		.forEach(length -> System.out.println("Length of the string is: " + length));
		final List<String> friendsWithN = friends.stream()
				.filter(name -> name.startsWith("N"))
				.collect(Collectors.toList());
		friendsWithN.forEach(System.out::println);
	}
}
