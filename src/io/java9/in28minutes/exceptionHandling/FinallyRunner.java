package io.java9.in28minutes.exceptionHandling;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FinallyRunner {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			int[] numbers = {1,2,3,4,5};
			int number = numbers[6];
			
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			System.out.println("Just before closing scanner");
			scanner.close();
		}
		
		System.out.println("This line should be printed");

	}
}
