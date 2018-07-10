package io.threads.timbuljava;

import static io.threads.timbuljava.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
	
	@Override
	public void run() {
		System.out.println(ANSI_BLUE + "Hello from another Thread called from Main Thread");
	}
}
