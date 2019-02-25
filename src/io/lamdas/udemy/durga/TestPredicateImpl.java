package io.lamdas.udemy.durga;

import java.util.function.Predicate;

public class TestPredicateImpl {
	
	public static void main(String[] args) {
		Predicate<Integer> P = i -> i > 10;
		System.out.println(P.test(100));
	}
}
