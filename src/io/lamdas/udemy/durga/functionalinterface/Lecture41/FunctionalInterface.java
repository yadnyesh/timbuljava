package io.lamdas.udemy.durga.functionalinterface.Lecture41;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionalInterface {
	
	public static void main(String[] args) {
		ArrayList<Student> studentArrayList = new ArrayList<>();
		studentArrayList.add(new Student("One", 100));
		studentArrayList.add(new Student("Two", 65));
		studentArrayList.add(new Student("Three", 45));
		studentArrayList.add(new Student("Four", 71));
		studentArrayList.add(new Student("Five", 85));
		studentArrayList.add(new Student("Six", 80));
		studentArrayList.add(new Student("Seven", 50));
		studentArrayList.add(new Student("Eight", 88));
		
		Function<Student, String> findStudentGrade = s -> {
			int marks = s.getMarks();
			if(marks >= 80) {
				return "Distinction";
			} else if (marks >= 60) {
				return "First Class";
			} else if (marks >= 50) {
				return "Second Class";
			} else if (marks >= 35) {
				return "Pass";
			} else {
				return "Error";
			}
		};
		
		for(Student student : studentArrayList) {
			System.out.println("Student " + student.getName() + " got grade: " + findStudentGrade.apply(student));
		}
		
		
	}
}

class Student {
	private String name;
	private int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
