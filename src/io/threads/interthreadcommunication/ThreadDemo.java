package io.threads.interthreadcommunication;

public class ThreadDemo {
	
	public static void main(String[] args) throws InterruptedException{
		ThreadA b = new ThreadA();
		b.start();
		synchronized(b){
			System.out.println("Main Thread calling wait method.....");
			b.wait();
			System.out.println(b.total);
		}
	}
}

//wait -> notify