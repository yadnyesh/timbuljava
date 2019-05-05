package io.lamdas.udemy.durga.functionalinterface.Lecture50;

import io.lamdas.udemy.durga.functionalinterface.Lecture41.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lecture50 {
	
	public static void main(String[] args) {
		ArrayList<Student> studentArrayList = new ArrayList<>();
		studentArrayList.add(new Student("One", 98));
		studentArrayList.add(new Student("Two", 55));
		studentArrayList.add(new Student("Three", 62));
		studentArrayList.add(new Student("Four", 71));
		studentArrayList.add(new Student("Five", 80));
		
		Predicate<Student> studentPredicate = s -> s.getMarks() >= 60;
		
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
		
		Consumer<Student> studentConsumer = s -> {
			System.out.println("Name: " + s.getName());
			System.out.println("Marks: " + s.getMarks());
			System.out.println("Grade: " + findStudentGrade.apply(s));
		};
		
		studentArrayList.stream().filter(studentPredicate).forEach(studentConsumer);
	}
}

class Student {
	private String name;
	private Integer marks;
	
	public Student(String name, Integer marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getMarks() {
		return marks;
	}
	
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
}
