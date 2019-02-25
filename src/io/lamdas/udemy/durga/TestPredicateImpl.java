package io.lamdas.udemy.durga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestPredicateImpl {
	
	public static void main(String[] args) {
		Predicate<Integer> P = i -> i > 10;
		System.out.println(P.test(100));
		
		Predicate<String> stringLengthPredicate = s -> s.length() > 5;
		System.out.println(stringLengthPredicate.test("yadnyesh"));
		
		Predicate<Collection> checkForEmptyCollection = c -> c.isEmpty();
		ArrayList<Integer> arrayListInteger = new ArrayList<>();
		arrayListInteger.add(10);
		System.out.println(checkForEmptyCollection.test(arrayListInteger));
	}
}
