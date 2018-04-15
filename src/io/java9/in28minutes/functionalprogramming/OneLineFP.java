package io.java9.in28minutes.functionalprogramming;

import java.util.List;

public class OneLineFP {
	
	public static void main(String[] args) {
		System.out.println(List.of(23,45,67,12)
				.stream()
				.filter(n -> n%2==0)
				.max((n1,n2) -> Integer.compare(n1,n2)).get());
	}
}
