package io.threads.timbuljava;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello from Main Thread!");
		
		Thread anotherThread = new AnotherThread();
		anotherThread.start();
		
		new Thread() {
			public void run() {
				System.out.println("Hello from Anonymous class");
			}
		}.start();
		
		
		System.out.println("Again from the Main Thread");
	}
}
