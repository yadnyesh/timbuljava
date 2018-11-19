package io.udemy.java8featuresDilip.functionalinterfaces;

import io.udemy.java8featuresDilip.data.Student;
import io.udemy.java8featuresDilip.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
	
	
	static Consumer<Student> consumerStudent = System.out::println;
	static List<Student> studentList = StudentDataBase.getAllStudents();
	
	public static void main(String[] args) {
		
		StudentDataBase.getAllStudents().forEach(consumerStudent);
		
	}

}
