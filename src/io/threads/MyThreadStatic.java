package io.threads;

public class MyThreadStatic extends Thread{
	
	static Thread mainThread;
	
	public void run() {
		try {
			mainThread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
		
	}
	
}
