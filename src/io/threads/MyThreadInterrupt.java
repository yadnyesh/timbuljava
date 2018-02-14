package io.threads;

public class MyThreadInterrupt {
	
	public void run() {
		for (int i=0; i <= 10; i++){
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
