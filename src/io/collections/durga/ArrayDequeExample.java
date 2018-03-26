package io.collections.durga;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	
	public static void main(String[] args) {
		Deque<String> myDeque = new ArrayDeque<>();
		myDeque.add("One");
		myDeque.add("Two");
		myDeque.add("Three");
		myDeque.add("Four");
		
		myDeque.stream().forEach(System.out::println);
		
	}
}
