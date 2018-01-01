package io.vs.reactive;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by z063407 on 1/1/18.
 * Last Responsive moment
 */
public class One {
	
	public static boolean isPrime(int number) {
		return number > 1 &&
				IntStream.range(2, number)
					.noneMatch(i -> number %2 ==0);
	}
	
	public static void main(String[] args) {
		Stream.iterate(100, e -> e + 1)
				.filter(One::isPrime)
				.limit(10)
				.forEach(System.out::println);
	}
}
