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
	
	public void displayc(){
		for(int i = 65; i <= 75; i++ ){
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
