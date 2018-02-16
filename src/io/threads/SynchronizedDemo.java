package io.threads;

import java.time.LocalDate;
import java.time.LocalTime;

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		DisplayMessage d = new DisplayMessage();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yogi");
		t1.start();
		t2.start();
		System.out.println(LocalDate.now().getMonth());
		System.out.println(LocalTime.now());
	}
}