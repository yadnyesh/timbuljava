package io.threads;

public class Display {

	public void displayn(){
		for (int i = 0; i <=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
