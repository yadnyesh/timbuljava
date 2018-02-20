package io.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
	
	public static void main(String[] args) {
		Stream.of("Yadnyesh", "Bharat", "Juvekar")
				.sorted()
				.findFirst()
				.ifPresent(System.out::println);
				
	}
}
