package io.lamdas.venkat;

public class Sample {
	
	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("Test: " + t.getName());
			}
		});
		th.start();
		Thread t = Thread.currentThread();
		System.out.println("Test1: " + t.getName());
		
	}
}
