package io.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
//		Queue<String> pqueue = new PriorityQueue<String>();
//		pqueue.add("India");
//		pqueue.add("Pakistan");
//		pqueue.add("Bangladesh");
//		pqueue.add("Srilanka");
//		pqueue.add("West Indies");
//		pqueue.add("England");
//		pqueue.stream().forEach(System.out::println);
		Queue<Book> pqueue = new PriorityQueue<Book>();
		Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
		Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	}
	
	

}
