package io.udemy.java8featuresDilip.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	static Predicate<Integer> peven = (i) -> i%2 == 0;
	static Predicate<Integer> pfive = (i) -> i%5 == 0;
	
	public static void main(String[] args) {
		
		//System.out.println(peven.test(4));
		predicateAnd();
		predicateOr();
	}
	
	public static void predicateAnd() {
		System.out.println(peven.and(pfive).test(10));
		System.out.println(peven.and(pfive).test(9));
	}
	
	public static void predicateOr() {
		System.out.println(peven.or(pfive).test(10));
		System.out.println(peven.or(pfive).test(8));
	}
}
