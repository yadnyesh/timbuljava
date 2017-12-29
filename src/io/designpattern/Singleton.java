package io.designpattern;

/**
 * Created by z063407 on 12/27/17.
 */
public class Singleton {
	
	private static volatile Singleton instance = null;
	
	private Singleton() {
	
	}
	
	public static Singleton getInstance() {
		
		if(instance == null){
			synchronized(Singleton.class) {
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
	
}


/***
 # Singleton
 - Static in nature
 - Thread Safe
 - Private Constructor
 - Private Instance of class
 - No parameters to the constructor
 
 #### Disadvantages
 - Overuse, hindrance when writing Unit Testing
 - Slow down your app - use threads carefully
 - Don't use it as factory
 
***/