package io.threads;

public class DisplayMessage {
	
	public void wish(String name) {
		for (int i = 0 ; i < 10; i++){
			System.out.println("Hello: " + name);
			try{
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
}
