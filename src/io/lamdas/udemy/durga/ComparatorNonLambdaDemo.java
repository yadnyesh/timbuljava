package io.lamdas.udemy.durga;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ComparatorNonLambdaDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(90);
		arrayList.add(60);
		arrayList.add(5);
		arrayList.add(0);
		arrayList.add(2);
		Collections.sort(arrayList, new MyComparator());
		System.out.println(arrayList);
	}
	
	

}

class MyComparator implements Comparator<Integer> {
	
	@Override
	public int compare(Integer t1, Integer t2) {
		return (t1 > t2) ? -1: (t1 < t2) ? 1 : 0 ;
	}
}
