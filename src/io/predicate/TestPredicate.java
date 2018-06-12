package io.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestPredicate {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(-1,-2, -3, -4, -5, -6, 90, 91, 78, 45, 5, 8 ,9, 22, 44, 47);
		List<Integer> positiveNumbers = new ArrayList<>();
		System.out.println(numbers.stream().filter(IntegerPredicate.positiveIntegerPredicate).collect(Collectors.toList()));
	}
}
