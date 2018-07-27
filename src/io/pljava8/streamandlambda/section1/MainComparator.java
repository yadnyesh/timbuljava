package io.pljava8.streamandlambda.section1;

public class MainComparator {
	
	public static void main(String[] args) {
		Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
	}
}
