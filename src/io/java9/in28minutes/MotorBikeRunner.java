package io.java9.in28minutes;

public class MotorBikeRunner {
	
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	}
}
