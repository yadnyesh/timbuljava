package io.exceptionhandling;

import java.util.Scanner;

public class ClientTest {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter person age: ");
			int age = scanner.nextInt();
			new ClientTest().calculateExtraBenefits(age);
			
			System.out.println("Enter person age: ");
			age = scanner.nextInt();
			new ClientTest().calculateExtraBenefits(age);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void calculateExtraBenefits(int age) throws InvalidAgeException{
		if (age < 60){
			System.out.println("Benefits not applicable");
			//throw new InvalidAgeException(age);
		} else {
			System.out.println("Benefits Extended!");
		}
	}
}
