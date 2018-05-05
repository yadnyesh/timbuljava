package io.java9.in28minutes.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
	public static void main(String[] args) {
		String str = "ABCD ABCD ABCD";
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
		for (char character: str.toCharArray()){
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}
		System.out.println(occurances);
	}
}
