package io.functional;

public class CalculateFactorial {
	
	public static void main(String[] args) {
		int answer = 47;
		new Thread(() -> System.out.println("hello World: " + answer)).start();
		
	}
}
