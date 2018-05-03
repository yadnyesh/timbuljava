package io.java9.in28minutes.exceptionHandling;

import java.util.Scanner;

public class FinallyRunner {
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int[] numbers = {1,2,3,4,5};
			int number = numbers[6];
			scanner.close();
		} catch(Exception e){
			e.printStackTrace();
		}

	}
}
