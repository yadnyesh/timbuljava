package io.udemy.java8featuresDilip.lambdas;

public class RunnableExample {
	
	public static void main(String[] args) {
		/*
			prior to Java 8
		 */
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Runnable 1");
			}
		};
		
		new Thread(runnable).start();
		
		/*
			using lambdas
		 */
		
		Runnable runnablelambda = () -> {
			System.out.println("Inside Runnable with lambda");
		};
		
		new Thread(runnablelambda).start();
		new Thread(()-> System.out.println("Inside single line lambda")).start();
	}
}
