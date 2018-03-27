package io.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		Queue<String> pqueue = new PriorityQueue<String>();
		pqueue.add("India");
		pqueue.add("Pakistan");
		pqueue.add("Bangladesh");
		pqueue.add("Srilanka");
		pqueue.add("West Indies");
		pqueue.add("England");
		pqueue.stream().forEach(System.out::println);
	}
	
	

}
