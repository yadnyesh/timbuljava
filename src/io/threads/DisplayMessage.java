package io.threads;

public class DisplayMessage {
	int t = 0;
	public synchronized void wish(String name) {
		for (int i = 0 ; i < 10; i++){
			System.out.println("Hello: " + name + " t is, :" + t);
			t++;
			try{
				Thread.sleep(0);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
}
