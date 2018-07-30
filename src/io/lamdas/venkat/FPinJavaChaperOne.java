package io.lamdas.venkat;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FPinJavaChaperOne {
	
	public static Predicate<String> checkStartsWith(final String letter) {
		return name -> name.startsWith(letter);
	}
	
	public final static void pickName(final List<String> names, final String startingLetter){
	
		final Optional<String> foundName = names.stream()
											.filter(name -> name.startsWith(startingLetter))
											.findFirst();
		System.out.println(String.format("Name starting with %s: %s", startingLetter, foundName.orElse("No Name Found")));
	}
	
	public static void main(String[] args) {
		
		
		final Function<String, Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		pickName(friends, "N");
		pickName(friends, "Y");
		friends.forEach(System.out::println);
		friends.stream().map(String::toUpperCase)
		.forEach(System.out::println);
		friends.stream().map(String::length)
		.forEach(length -> System.out.println("Length of the string is: " + length));
		
		final Predicate<String> startsWithN = name -> name.startsWith("N");
		
		final List<String> friendsWithN = friends.stream()
				.filter(startsWithLetter.apply("N"))
				.collect(Collectors.toList());
		friendsWithN.forEach(System.out::println);
	}
}
