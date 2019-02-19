package io.lamdas.udemy.durga;

public class AnonymousInnerClass {
	
	int x = 888;
	
	
	interface MyInterface {
		void printX();
	}
	
	public void myPrintClass()
	{
		MyInterface myInterface = new MyInterface() {
			int x = 999;
			@Override
			public void printX() {
				System.out.println(this.x);
			}
		};
		myInterface.printX();
	}
	
	
	public static void main(String[] args) {
//		Thread t = new Thread(() -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("Child Thread");
//			}
//		});
//		t.start();
		AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
		anonymousInnerClass.myPrintClass();
	
	}
}
