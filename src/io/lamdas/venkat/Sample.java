package io.lamdas.venkat;

public class Sample {
	
	public static void main(String[] args) {
		Thread th = new Thread(() -> System.out.println("Test: " + Thread.currentThread().getName()));
		th.start();
		Thread t = Thread.currentThread();
		System.out.println("Test1: " + t.getName());
		
	}
}
