package io.threads.interthreadcommunication;

public class ThreadDemo {
	
	public static void main(String[] args) throws InterruptedException{
		ThreadA b = new ThreadA();
		b.start();
		Thread.sleep(1);
		System.out.println(b.total);
	}
}
