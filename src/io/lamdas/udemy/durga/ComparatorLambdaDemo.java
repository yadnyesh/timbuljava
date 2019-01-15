package io.lamdas.udemy.durga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorLambdaDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(90);
		arrayList.add(60);
		arrayList.add(5);
		arrayList.add(0);
		arrayList.add(2);
		arrayList.add(25);
		Collections.sort(arrayList, (i1, i2) -> i1 > i2 ? -1 : i1 < i2 ? 1 : 0);
		System.out.println(arrayList);
	}
}
