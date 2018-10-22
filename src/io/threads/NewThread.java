package io.threads;

import static java.lang.Thread.sleep;

public class NewThread {
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Thread thread1 = new Thread(new Task());
			thread1.start();
		}
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
	
	static class Task implements Runnable {
		
		@Override
		public void run() {
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread Name: " + Thread.currentThread().getName());
		}
	}
}
