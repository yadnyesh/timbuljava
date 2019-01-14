package io.lamdas.udemy.durga;

public class InvokeLambda {
	
	public static void main(String[] args) {
		
//		InterfaceSAM interfaceSAM = (a,b) -> System.out.println("The sum of the two numbers is: " + (a+b));
//		interfaceSAM.addTwoNumbers(20, 30);
		InterfaceSAM interfaceSAM = s -> s.length();
		System.out.printf("Lambda implementation ---> " + interfaceSAM.getStringLength("Yadnyesh"));
	}
}
