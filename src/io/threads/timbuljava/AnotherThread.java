package io.threads.timbuljava;

public class AnotherThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hello from another Thread called from Main Thread");
	}
}
