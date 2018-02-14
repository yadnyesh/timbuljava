package io.threads;

public class ThreadJoinDemo {
	
	public static void main(String[] args) {
		MyThreadJoInt t = new MyThreadJoInt();
		t.start();
		try{
			t.join();
		} catch(InterruptedException e){
			System.out.println(e);
		}
		
		for (int i=0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
