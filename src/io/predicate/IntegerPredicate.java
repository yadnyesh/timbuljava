package io.predicate;

import java.util.function.Predicate;

public class IntegerPredicate {
	
	public static Predicate<Integer> positiveIntegerPredicate = new Predicate<Integer>() {
		
		@Override
		public boolean test(Integer integer) {
			return integer > 0;
		}
	};
	
}
