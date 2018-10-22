package io.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 Executor service uses Blocking Queue, since it is thread safe
 */

public class NewThread {
	
	public static void main(String[] args) {
		int cpuCoreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Number of processor cores: " + cpuCoreCount);
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i =0; i < 100; i++) {
			service.execute(new Task());
		}
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
	
	static class Task implements Runnable {
		
		@Override
		public void run() {
			System.out.println("Thread Name: " + Thread.currentThread().getName());
		}
	}
}
