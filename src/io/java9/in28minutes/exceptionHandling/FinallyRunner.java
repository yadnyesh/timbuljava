package io.java9.in28minutes.exceptionHandling;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FinallyRunner {
	
	public static void main(String[] args) {
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			int[] numbers = {1,2,3,4,5};
			int number = numbers[6];
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			System.out.println("Just before closing scanner");
			if(scanner != null){
				scanner.close();
			}
		}
		System.out.println("This line should be printed");

	}
}
