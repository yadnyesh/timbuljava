package io.java9.in28minutes.Threads;


class Task1 extends Thread {
	public void run() {
		for (int i = 101; i <=199; i++) {
			System.out.print(i + " " );
		}
		System.out.println("\nTask 1 Done! ");
	}
}

public class ThreadBasicsRunner {
	
	public static void main(String[] args) {
		
		for (int i = 201; i <=299; i++) {
			System.out.print(i + " " );
		}
		System.out.println("\nTask 1 Done! ");
		for (int i = 301; i <=399; i++) {
			System.out.print(i + " " );
		}
		System.out.println("\nTask 1 Done! ");
	}
}
