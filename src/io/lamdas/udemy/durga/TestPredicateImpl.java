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
		
		int[] myIntArray = {0, 5, 10, 15, 20, 25, 30};
		Predicate<Integer> numberGreaterThanTen = i -> i > 10;
		Predicate<Integer> checkForEvenNumber = i -> i % 2 == 0;
		
		System.out.println("Numbers greater than 10 are");
		myFunction(numberGreaterThanTen, myIntArray);
		
		System.out.println("Even numbers are");
		myFunction(checkForEvenNumber, myIntArray);
		
		System.out.println("Numbers NOT greater than 10 are");
		myFunction(numberGreaterThanTen.negate(), myIntArray);
		
		System.out.println("Numbers greater than 10 AND Even are");
		myFunction(numberGreaterThanTen.and(checkForEvenNumber), myIntArray);
		
		System.out.println("Numbers greater than 10 OR Even are");
		myFunction(numberGreaterThanTen.or(checkForEvenNumber), myIntArray);
		
	}
	
	static void myFunction(Predicate predicate, int[] inputArray) {
		for (int y : inputArray) {
			if(predicate.test(y)) {
				System.out.println(y);
			}
		}
	}
}
