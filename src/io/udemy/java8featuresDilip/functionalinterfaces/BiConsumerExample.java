package io.udemy.java8featuresDilip.functionalinterfaces;

import io.udemy.java8featuresDilip.data.Student;
import io.udemy.java8featuresDilip.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	
	static List<Student> studentList = StudentDataBase.getAllStudents();
	
	public static void main(String[] args) {
		
		BiConsumer<String, List<String>> biConsumerStudentWithActivities = (name, activities) -> System.out.println(name + " : " + activities);
		studentList.forEach(student -> biConsumerStudentWithActivities.accept(student.getName(), student.getActivities()));
	}
	
}
