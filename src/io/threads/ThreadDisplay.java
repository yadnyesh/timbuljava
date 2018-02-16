package io.threads;

public class ThreadDisplay extends Thread{

	Display d;
	
	ThreadDisplay(Display d){
		this.d = d;
	}

	public void run() {
		d.displayn();
	}
}
