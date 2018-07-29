package io.lamdas.venkat;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FPinJavaChaperOne {
	
	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		friends.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
	}
}
