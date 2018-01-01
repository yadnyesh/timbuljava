package io.vs.reactive;

import java.util.stream.IntStream;

/**
 * Created by z063407 on 1/1/18.
 */
public class One {
	
	public static boolean isPrime(int number) {
		return number > 1 &&
				IntStream.range(2, number)
					.noneMatch(i -> number %2 ==0);
	}
	
	public static void main(String[] args) {

	}
}
