package io.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Yadnyesh");
		map.put(101, "Yadnyesh - 101");
		map.put(102, "Yadnyesh - 102");
		map.keySet().stream().forEach(System.out::println);
	}
}
