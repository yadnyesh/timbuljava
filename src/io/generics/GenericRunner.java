package io.generics;

public class GenericRunner {
	
	
	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Yadnyesh");
		System.out.println(list);
		
		MyCustomList<Integer> intlist = new MyCustomList<>();
		intlist.addElement(Integer.valueOf(1));
		System.out.println(intlist);
	}
}
