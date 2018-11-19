package io.udemy.java8featuresDilip.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	
	static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
	
	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
		System.out.println(binaryOperator.apply(3,5));
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println("Result of MaxBy is: " + maxBy.apply(4,5));
	}
}
