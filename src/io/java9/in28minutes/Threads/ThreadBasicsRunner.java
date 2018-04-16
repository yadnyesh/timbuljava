package io.java9.in28minutes.Threads;


class Task1 extends Thread {
	public void run() {
		System.out.println("Task 1 started");
		for (int i = 101; i <=199; i++) {
			System.out.print(i + " " );
		}
		System.out.println("\nTask 1 Done! ");
	}
}

public class ThreadBasicsRunner {
	
	public static void main(String[] args) {
		
		Task1 task1 = new Task1();
		task1.start();
		
		System.out.println("Task 2 started");
		for (int i = 201; i <=299; i++) {
			System.out.print(i + " " );
		}
		System.out.println("\nTask 2 Done! ");
		
		System.out.println("Task 3 started");
		for (int i = 301; i <=399; i++) {
			System.out.print(i + " " );
		}
		System.out.println("\nTask 3 Done! ");
	}
}
