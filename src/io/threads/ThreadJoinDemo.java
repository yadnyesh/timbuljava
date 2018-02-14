package io.threads;

public class ThreadJoinDemo {
	
	public static void main(String[] args) throws InterruptedException{
		MyThreadJoInt t = new MyThreadJoInt();
		t.start();

		t.join();
		
		for (int i=0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
