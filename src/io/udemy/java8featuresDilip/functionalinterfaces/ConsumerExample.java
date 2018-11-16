package io.udemy.java8featuresDilip.functionalinterfaces;


import io.udemy.java8featuresDilip.data.Student;
import io.udemy.java8featuresDilip.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
	static Consumer<Student> consumerStudent = (student) -> System.out.println(student);
	static Consumer<Student> consumerStudentName = (student) -> System.out.print(student.getName());
	static Consumer<Student> consumerStudentActivities = (student) -> System.out.println(student.getActivities());
	static List<Student> studentList = StudentDataBase.getAllStudents();
	
	public static void printName() {
		studentList.forEach(consumerStudent);
	}
	
	public static void printNameAndActivities() {
		studentList.forEach(consumerStudentName.andThen(consumerStudentActivities));
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		studentList.forEach(student -> {
			if(student.getGradeLevel() >= 3 && student.getGpa() >=3.9) {
				consumerStudentName.andThen(consumerStudentActivities);
			}
		});
	}
	
	public static void main(String[] args) {
		Consumer<String> consumerString = (s) -> System.out.println(s.toUpperCase());
		//consumerString.accept("yadnyesh");
		//printName();
		//printNameAndActivities();
		printNameAndActivitiesUsingCondition();
		
	}
}
