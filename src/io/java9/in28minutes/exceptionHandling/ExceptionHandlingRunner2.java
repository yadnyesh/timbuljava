package io.java9.in28minutes.exceptionHandling;

public class ExceptionHandlingRunner2 {
	
	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}
	
	private static void method1() {
		method2();
		System.out.println("Method 1 completed");
	}
	
	private static void method2() {
		try {
			String str = null;
			str.length();
			System.out.println("Method 2 completed");
		} catch(NullPointerException ex){
			System.out.println("Null pointer exception");
			ex.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
