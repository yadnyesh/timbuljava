package io.udemy.java8featuresDilip.functionalinterfaces;


import io.udemy.java8featuresDilip.data.Student;
import io.udemy.java8featuresDilip.data.StudentDataBase;
import io.yadnyesh.StudentMain;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void printName() {
		Consumer<Student> c2 = (student) -> System.out.println(student);
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c2);
	}
	
	public static void printNameAndActivities() {
		Consumer<Student> consumerStudentName = (student) -> System.out.print(student.getName());
		Consumer<Student> consumerStudentActivities = (student) -> System.out.println(student.getActivities());
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(consumerStudentName.andThen(consumerStudentActivities));
	}
	
	
	public static void main(String[] args) {
		Consumer<String> consumerString = (s) -> System.out.println(s.toUpperCase());
		consumerString.accept("yadnyesh");
		printName();
		printNameAndActivities();
		
	}
}
