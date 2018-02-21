package io.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {
	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
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
