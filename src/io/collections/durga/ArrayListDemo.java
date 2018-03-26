package io.collections.durga;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		l.stream().forEach(System.out::println);
		l.remove(2);
		l.add(2, "M");
		l.add("N");
		l.stream().forEach(System.out::println);
		System.out.println("============");
		System.out.println(l);
	}
}
