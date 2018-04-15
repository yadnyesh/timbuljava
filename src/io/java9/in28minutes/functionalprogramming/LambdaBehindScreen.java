package io.java9.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer>{
	
	@Override
	public boolean test(Integer number) {
		return number%2 == 0;
	}
}

class SystemOutConsumer implements Consumer<Integer>{
	
	@Override
	public void accept(Integer integer) {
		System.out.println(integer);
	}
}

public class LambdaBehindScreen {
	
	public static void main(String[] args) {
		List.of(23,45,67,12, 36, 48, 22)
				.stream()
				.filter(n -> n%2==0)
				.forEach(System.out::println);
		System.out.println("My Implementation now...");
		List.of(23,45,67,12, 36, 48, 22)
				.stream()
				.filter(new EvenNumberPredicate())
				.forEach(new SystemOutConsumer());
		
	}
}
