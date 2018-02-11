package io.threads;

public class ThreadDemo {
	
	public static void main(String[] args) {
		MyThread t = new MyThread(); //thread instantiation
		t.start(); //Main thread starts child thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
