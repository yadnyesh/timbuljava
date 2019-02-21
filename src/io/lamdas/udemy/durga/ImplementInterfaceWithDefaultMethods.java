package io.lamdas.udemy.durga;

public class ImplementInterfaceWithDefaultMethods implements DefaultMethodInInterface{
	
	public void printMessage(String message) {
		System.out.println("The encoded message is: " + message);
	}
	
	public static void main(String[] args) {
		ImplementInterfaceWithDefaultMethods implementInterfaceWithDefaultMethods = new ImplementInterfaceWithDefaultMethods();
		implementInterfaceWithDefaultMethods.printMessage("India vs Aus on 27th Feb");
	}
}
