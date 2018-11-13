package io.udemy.java8featuresDilip.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
	
	public static void main(String[] args) {
		/**
		 * prior java 8
		 */
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("Result of the Lambda comparator is: " + comparator.compare(3,2));
	}
}
