package io.java9.in28minutes;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int[] marks;
	
	public Student(String name, int[] marks){
		this.name = name;
		this.marks = marks;
	}
	
	public int getNumberOfMarks() {
		return marks.length;
	}
	
	public int getTotalSumOfMarks() {
		return Arrays.stream(marks).sum();
	}
}
