package io.threads;

public class ThreadDisplayChar extends Thread {
	Display d;
	
	ThreadDisplayChar(Display d){
		this.d = d;
	}
	
	public void run(){
		d.displayc();
	}
}
