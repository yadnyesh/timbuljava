package io.generics;

import java.util.List;

public class GenericRunner {
	
	static double sumOfNumberList(List<? extends Number> numbers) {
		double value = 0.0;
		for(Number number1:numbers){
			value += number1.doubleValue();
		}
		return value;
	}
	
	public static void main(String[] args) {
		
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Yadnyesh");
		System.out.println(list);
		
		MyCustomList<Integer> intlist = new MyCustomList<>();
		intlist.addElement(Integer.valueOf(1));
		System.out.println(intlist);
		System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
	}
}
