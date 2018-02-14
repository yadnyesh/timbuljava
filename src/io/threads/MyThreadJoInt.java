package io.threads;

public class MyThreadJoInt extends Thread{


	public void run(){
		for(int i =0; i < 10; i++){
			System.out.println("My Thread");
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e){
				System.out.println("e");
			}
		}
		System.out.println("Completed Child Thread");
	}


}
