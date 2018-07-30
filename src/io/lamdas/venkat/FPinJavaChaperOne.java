package io.lamdas.venkat;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FPinJavaChaperOne {
	
	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		friends.forEach(System.out::println);
		friends.stream().map(String::toUpperCase)
		.forEach(System.out::println);
		friends.stream().map(name -> name.length())
		.forEach(length -> System.out.println("Length of the string is: " + length));
	}
}
