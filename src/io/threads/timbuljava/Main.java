package io.threads.timbuljava;

import static io.threads.timbuljava.ThreadColor.ANSI_GREEN;
import static io.threads.timbuljava.ThreadColor.ANSI_PURPLE;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(ANSI_PURPLE + "Hello from Main Thread!");
		
		Thread anotherThread = new AnotherThread();
		anotherThread.start();
		
		new Thread() {
			public void run() {
				System.out.println(ANSI_GREEN + "Hello from Anonymous class");
			}
		}.start();
		
		
		System.out.println(ANSI_PURPLE +"Again from the Main Thread");
	}
}
