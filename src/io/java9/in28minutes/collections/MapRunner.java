package io.java9.in28minutes.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
	
	public static void main(String[] args) {
		String str = "This is an awesome occasion. This has never happened before";
		Map<Character, Integer> occurances = new HashMap<>();
		char[] chars = str.toCharArray();
		for(char character:chars){
			Integer integer = occurances.get(character);
			if(integer == null){
				occurances.put(character,1);
			} else {
				occurances.put(character,integer+1);
			}
		}
		System.out.println(occurances);
		
		
		
	}
}
