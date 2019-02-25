package io.lamdas.udemy.durga;

public interface DefaultMethodInInterface {
	
	default void printMessage(String message) {
		System.out.println("The decoded message is: " + message);
	}
	
	public static void myUtilityMethod() {
		System.out.println("This is how Utility methods can be declared");
	}
}


