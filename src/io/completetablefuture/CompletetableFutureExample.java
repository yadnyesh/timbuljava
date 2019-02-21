package io.completetablefuture;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletetableFutureExample {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Future<Integer> future = executorService.submit(new Task());
		
		try {
			Integer resultInteger = future.get();
			System.out.println("Result from the task is: " + resultInteger);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static class Task implements Callable<Integer> {
		
		@Override
		public Integer call() {
			return new Random().nextInt();
		}
	}
}
