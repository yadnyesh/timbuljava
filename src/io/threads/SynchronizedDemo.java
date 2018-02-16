package io.threads;

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		DisplayMessage d = new DisplayMessage();
		MyThread t1 = new MyThread(d, "Dhoni");
		t1.start();
	}
}