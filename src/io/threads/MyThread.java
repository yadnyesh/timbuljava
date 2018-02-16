package io.threads;

public class MyThread extends Thread{
	
	DisplayMessage d;
	String name;
	
	MyThread(DisplayMessage d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run(){
		d.wish(name);
	}
	
	
//	public void run() {
//		for (int i=0; i < 10; i++) {
//			System.out.println("Child Thread");
//			Thread.yield();
//		}
//	}
}
