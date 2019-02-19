package io.lamdas.udemy.durga;

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		});
		t.start();
	}
}
