package io.udemy.timbuljava;

public class Hello {
	
	public static void main(String[] args) {
		System.out.println("Hello World for commit " + divideEAFP(0,0));
		
	}
	
	private static int divideLBYL(int x, int y) {
		if(y != 0){
			return x / y;
		} else {
			return 0;
		}
	}
	
	private static int divideEAFP(int x, int y) {
		try {
			return x /y;
		} catch(Exception e){
			System.out.println(e.toString());
			return 0;
		}
	}
	
}
