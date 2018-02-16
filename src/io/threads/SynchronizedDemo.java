package io.threads;

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		DisplayMessage d = new DisplayMessage();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yogi");
		t1.start();
		t2.start();
	}
}