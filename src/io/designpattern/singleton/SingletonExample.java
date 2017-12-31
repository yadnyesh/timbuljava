package io.designpattern.singleton;

/**
 * Created by z063407 on 12/27/17.
 */
public class SingletonExample {
	
	public static void main(String[] args) {
	
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance1);
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance2);
		
		/**
		 * 1. Runtime.getRuntime()
		 * 2. Spring
		 * 3. Logger
		 */
	}
}
