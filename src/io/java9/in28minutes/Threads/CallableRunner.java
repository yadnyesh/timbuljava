package io.java9.in28minutes.Threads;

import java.util.concurrent.*;

class CallableTask implements Callable<String>{
	
	private String name;
	
	public CallableTask(String name){
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return "Hello " + name;
	}
}


public class CallableRunner {
	
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> in28minutes = executorService.submit(new CallableTask("in28minutes"));
		System.out.println("\n CallableTask(\"in28minutes\") executed");
		String welcomeMessage = in28minutes.get();
		System.out.println(welcomeMessage);
		System.out.println("\n Main Completed");
	}
}
