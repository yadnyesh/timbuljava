package io.udemy.java8featuresDilip.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		Predicate<Integer> p = (i) -> {return i%2 == 0;};
		System.out.println(p.test(4));
	}

}
