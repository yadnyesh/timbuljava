package io.exceptionhandling;

public class InvalidAgeException extends RuntimeException{
	private int age;
	
	public InvalidAgeException() {
		super("Invalid Age");
	}
	
	public InvalidAgeException(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "InvalidAgeException{" + "age=" + age + '}';
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
