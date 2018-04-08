package io.java9.in28minutes;

public class MotorBike {
	
	private int speed;
	
	MotorBike(int speed) {
		this.speed =speed;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public void increaseSpeed(int speedIncrease) {
		this.speed = this.speed + speedIncrease;
	}
	
}
