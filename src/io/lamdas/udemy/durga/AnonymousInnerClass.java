package io.lamdas.udemy.durga;

public class AnonymousInnerClass {
	Runnable r = new Runnable() {
		@Override
		public void run() {
			System.out.println("Hurray!");
		}
	};
}
