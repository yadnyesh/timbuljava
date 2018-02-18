package io.threads.interthreadcommunication;

public class ThreadDemo {
	
	public static void main(String[] args) throws InterruptedException{
		ThreadA b = new ThreadA();
		b.start();
		b.join(); //Wait till ThreadA is completed
		System.out.println(b.total);
	}
}
