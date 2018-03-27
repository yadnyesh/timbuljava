package io.collections.durga;

public class Book {
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
			if (this.id > book.id){
				return 1;
			} else if (this.id < book.id) {
				return -1;
			}
			else
				return 0;
		}
}
