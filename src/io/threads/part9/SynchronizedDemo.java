package io.threads.part9;

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		Display d = new Display();
		MyThread td = new MyThread(d, "dhoni");
		MyThread tv = new MyThread(d, "Kohli");
	}
}
