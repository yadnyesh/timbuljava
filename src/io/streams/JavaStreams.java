package io.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
	
	public static void main(String[] args) {

		Arrays.stream(new int[]{1,2,3,4,5,6})
				.map(x -> x*x)
				.average()
				.ifPresent(System.out::println);
				
	}
}
