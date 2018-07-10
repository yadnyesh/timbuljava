package io.java9.in28minutes.Threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
	
//	public static void main(String[] args) throws InterruptedException {
//		ExecutorService executorService = Executors.newFixedThreadPool(3);
//		List<CallableTask> callableTasks = List.of(new CallableTask("in28minutes"), new CallableTask("java"), new CallableTask("postgresql"));
//		List<Future<String>> in28minutes = executorService.invokeAll(callableTasks);
//		try {
//			in28minutes.stream().map(n -> {
//				try {
//					return n.get();
//				} catch(ExecutionException e) {
//					e.printStackTrace();
//					return null;
//				}
//			}).forEach(System.out::println);
//			executorService.shutdown();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//	}
}
