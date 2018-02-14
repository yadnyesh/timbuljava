package io.threads;

public class MyThreadInterrupt extends Thread{
	
	public void run() {
		try {
			for(int i = 0; i <= 10; i++) {
				System.out.println("Child Thread");
				Thread.sleep(2000);
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
}
