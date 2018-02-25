package io.seranddes;

import java.io.*;

public class SerializationDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.yad");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("abc.yad");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.i + " " + d2.j);
	}
}
