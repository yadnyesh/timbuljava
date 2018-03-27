package io.collections;

import io.collections.durga.Book;

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
		Book b4=new Book(90,"Operating System","Galvin","Wiley",6);
		Book b5=new Book(300,"Operating System","Galvin","Wiley",6);
		Book b6=new Book(122,"Operating System","Galvin","Wiley",6);
		Book b7=new Book(10000,"Operating System","Galvin","Wiley",6);
		Book b8=new Book(455,"Operating System","Galvin","Wiley",6);
		Book b9=new Book(569,"Operating System","Galvin","Wiley",6);
		Book b10=new Book(610,"Operating System","Galvin","Wiley",6);
		Book b11=new Book(89,"Operating System","Galvin","Wiley",6);
		Book b12=new Book(1,"Operating System","Galvin","Wiley",6);
		Book b13=new Book(900,"Operating System","Galvin","Wiley",6);
		
		pqueue.add(b1);
		pqueue.add(b2);
		pqueue.add(b3);
		pqueue.add(b4);
		pqueue.add(b5);
		pqueue.add(b6);
		pqueue.add(b7);
		pqueue.add(b8);
		pqueue.add(b9);
		pqueue.add(b10);
		pqueue.add(b11);
		pqueue.add(b12);
		pqueue.add(b13);
		pqueue.stream().forEach(System.out::println);
		System.out.println("After removing one Book");
		pqueue.remove();
		pqueue.stream().forEach(System.out::println);
	}
	
	

}
