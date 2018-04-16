package io.java9.in28minutes.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task extends Thread {
	private int number;
	
	public Task (int number) {
		this.number = number;
	}
	
	public void run() {
		System.out.println("\n Task " + number + " started");
		for (int i = number*100; i <= number*200 + 99; i++) {
			System.out.print(i + " " );
		}
		System.out.println("\n Task " + number + " Done");
	}
}

public class ExecutorServiceRunner {
	
	public static void main(String[] args) {
		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		
//		System.out.println("Task 3 kicked off");
//		for (int i = 301; i <=399; i++) {
//			System.out.print(i + " " );
//		}
//		System.out.println("\nTask 3 Done! ");
		
		executorService.shutdown();
	}
}
