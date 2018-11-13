package io.udemy.java8featuresDilip;

import java.util.stream.IntStream;

public class ImpvsDec {
	
	public static void main(String[] args) {
	
//		Imperative - how
		
		int sum = 0;
		
		for (int i= 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum using Imperative style: " + sum);
		
		
//		Declarative - What
		int sum1 = IntStream.rangeClosed(0,100)
				.parallel()
				.sum();
		
		System.out.println("Sum using Declarative style: " + sum1);
	}
}
