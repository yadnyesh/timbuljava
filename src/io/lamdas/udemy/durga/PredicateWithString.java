package io.lamdas.udemy.durga;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateWithString {
	
	public static void main(String[] args) {
		String[] names = {"Yadnyesh", null, "", "Durga", "Ravi", "", "Shiva", null};
		Predicate<String> isStringValid = s -> s != null && s.length() != 0;
		
		ArrayList<String> stringArrayList = new ArrayList<>();
		for(String s: names){
			if(isStringValid.test(s)){
				stringArrayList.add(s);
			}
		}
		System.out.println(stringArrayList);
	}
}
