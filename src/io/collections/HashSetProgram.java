package io.collections;

import java.util.HashSet;

public class HashSetProgram {
	
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("E");
		h.add("10");
		h.add("G");
		System.out.println(h.add("G"));
		System.out.println(h);
	}
	
	
}
