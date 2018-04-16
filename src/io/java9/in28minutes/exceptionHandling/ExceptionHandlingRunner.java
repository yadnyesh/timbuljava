package io.java9.in28minutes.exceptionHandling;

public class ExceptionHandlingRunner {
	
	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}
	
	private static void method1() {
		method2();
		System.out.println("Method 2 completed");
	}
	
	private static void method2() {
		String str = null;
		str.length();
	}
}
