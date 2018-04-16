package io.java9.in28minutes.Threads;

import java.util.concurrent.Callable;

class CallableTask implements Callable<String>{
	
	private String name;
	
	public CallableTask(String name){
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}
}


public class CallableRunner {
	
	public static void main(String[] args) {
	
	}
}
