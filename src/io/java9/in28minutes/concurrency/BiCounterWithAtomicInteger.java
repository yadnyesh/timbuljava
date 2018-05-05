package io.java9.in28minutes.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public void incrementI() {
		i.incrementAndGet();
	}
	
	public int getI() {
		return i.get();
	}
	
	public void incrementJ() {
		i.incrementAndGet()
	}
	
	public int getJ() {
		return j.get();
	}
}
