package io.lamdas.venkat;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	
	public static void main(String[] args) {
		Thread th = new Thread(() -> System.out.println("Test: " + Thread.currentThread().getName()));
		th.start();
		Thread t = Thread.currentThread();
		System.out.println("Test1: " + t.getName());
		
		List<String> newString = new ArrayList<String>();
		newString.add("Test");
		newString.add("Test1");
		newString.add("Test2");
		newString.add("Test3");
		newString.add("Test4");
		newString.add("Test5");
		
		newString.stream()
				.forEach(System.out::println);
		
	}
}
