package io.udemy.java8featuresDilip.functionalinterfaces;

public class FunctionExample1 {
	
	public static String performContcat(String str) {
		return FunctionExample.addDefaultString.apply(str);
	}
	
	public static void main(String[] args) {
		System.out.println(performContcat("yadnyesh"));
	}
}
