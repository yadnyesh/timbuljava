package io.threads;

public class ThreadDemo {
	
	public static void main(String[] args) {
//		MyThread t = new MyThread(); //thread instantiation
//		t.run(); //Main thread starts child thread
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main Thread");
//		}
		
		
//		MyRunnable r = new MyRunnable();
//		Thread t = new Thread(r); //r is called target runnable
//		t.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main Thread");
//		}
	
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		t1.start();
		
	}
	
	//t.start --> New thread is created
	//t.run --> Same thread like calling a method --- only calling thread does the operation
}
