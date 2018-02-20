package io.streams;

import java.util.stream.IntStream;

public class JavaStreams {
	
	public static void main(String[] args) {
		IntStream
				.range(1,10)
				.forEach(System.out::print);
		System.out.println();
	}
}
