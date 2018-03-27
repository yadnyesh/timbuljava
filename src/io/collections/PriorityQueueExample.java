package io.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	
	class Book {
		private int id;
		private String name;
		private String author;
		private String publisher;
		int quantity;
		
		public Book(){
		
		}
		
		public Book(int id, String name, String author, String publisher, int quantity) {
			this.id = id;
			this.name = name;
			this.author = author;
			this.publisher = publisher;
			this.quantity = quantity;
		}
		
		@Override
		public String toString() {
			return "Book{" + "id=" + id + ", name='" + name + '\'' + ", author='" + author + '\'' + ", publisher='" + publisher + '\'' + ", quantity=" + quantity + '}';
		}
		
		public int compareTo(Book book){
			if (this.id > book.id);
		}
	}
	
	
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
