package io.threads;

public class ThreadJoinDemoMain {
	
	public static void main(String[] args) throws InterruptedException {
		MyThreadStatic.mainThread = Thread.currentThread();
		MyThreadStatic t = new MyThreadStatic();
		t.start();
		t.join();
		for (int i = 0; i < 10; i++){
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}
	
}
