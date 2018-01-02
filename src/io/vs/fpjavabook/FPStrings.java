package io.vs.fpjavabook;

import java.util.Arrays;
import java.util.List;

public class FPStrings {
	

	
	public static void main(String[] args) {
		final List<String> friends =
			Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
			friends.stream().forEach(System.out::println);
	}
}
