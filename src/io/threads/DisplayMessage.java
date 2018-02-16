package io.threads;

public class DisplayMessage {
	
	public void wish(String name) {
		int t = 0;
		for (int i = 0 ; i < 10; i++){
			System.out.println("Hello: " + name + " t is, :" + t);
			t = t + 1;
			try{
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
}
