package io.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		PriorityQueue<String> pqueue = new PriorityQueue<String>();
		pqueue.add("India");
		pqueue.add("Pakistan");
		pqueue.add("Bangladesh");
		pqueue.stream().forEach(System.out::println);
	}
	
	

}
