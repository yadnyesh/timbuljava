package io.threads.part9;

public class Display {

	public void wish(String name){
		for (int i =0; i <=10 ; i++){
			System.out.println("Hey...");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
