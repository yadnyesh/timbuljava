package io.threads;

public class AnotherSynchronizeDemo {
	
	public static void main(String[] args) {
		Display d = new Display();
		ThreadDisplay tn = new ThreadDisplay(d);
		ThreadDisplayChar tc = new ThreadDisplayChar(d);
		tn.start();
		tc.start();
	}
}
