package io.lamdas.udemy.durga;

public interface DefaultMethodInInterface {
	
	default void printMessage(String message) {
		System.out.println("The decoded message is: " + message);
	}
}


