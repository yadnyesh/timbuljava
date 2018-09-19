package io.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
	
	public static void main(String[] args) {

		Arrays.stream(new int[]{2,4,6,8,10})
				.map(x -> x*x)
				.average()
				.ifPresent(System.out::println);
	}
}
