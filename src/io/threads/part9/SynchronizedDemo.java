package io.threads.part9;

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		Display dt = new Display();
		Display dv = new Display();
		MyThread td = new MyThread(dt, "dhoni");
		MyThread tv = new MyThread(dv, "Kohli");
		td.start();
		tv.start();
	}
}
