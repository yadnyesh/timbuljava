package io.threads;

public class ThreadInterruptDemo {
	
	public static void main(String[] args) {
		MyThreadInterrupt t = new MyThreadInterrupt();
		t.start();
		//t.interrupt();
		System.out.println("End of Main");
	}
}
