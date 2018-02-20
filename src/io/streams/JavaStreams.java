package io.streams;

import java.util.stream.IntStream;

public class JavaStreams {
	
	public static void main(String[] args) {
		
		System.out.println(
				IntStream
				.range(1,5)
				.sum()
		);
		
//		IntStream
//				.range(1,10)
//				.skip(5)
//				.forEach(x -> System.out.println(x));
//		System.out.println();
	}
}
