package io.threads;

public class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		//Job of a thread
		for(int i = 0; i < 10; i++){
			System.out.println("Child Thread");
		}
	}
}
