package io.lamdas.udemy.durga;

import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetDemo1 {
	
	
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1: 0);
		treeSet.add(10);
		treeSet.add(11);
		treeSet.add(9);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(5);
		System.out.println("Natural sorting: " + treeSet);
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(100, "Yadnyesh");
		treeMap.put(101, "Sunny");
		
		
	}
}
