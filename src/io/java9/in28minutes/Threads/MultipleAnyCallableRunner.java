package io.java9.in28minutes.Threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTask> callableTasks = List.of(new CallableTask("in28minutes"), new CallableTask("java"), new CallableTask("postgresql"));
		String in28minutes = executorService.invokeAny(callableTasks);
		System.out.println(in28minutes);
		executorService.shutdown();
		
	}
}
