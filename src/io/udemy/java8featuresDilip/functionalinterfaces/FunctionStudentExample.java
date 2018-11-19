package io.udemy.java8featuresDilip.functionalinterfaces;

import io.udemy.java8featuresDilip.data.Student;
import io.udemy.java8featuresDilip.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
	
	public static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
		Map<String, Double> studentGradeMap = new HashMap<>();
		students.forEach(student -> {
			studentGradeMap.put(student.getName(), student.getGpa());
		});
		return studentGradeMap;
	});
	
	public static void main(String[] args) {
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
	}
}
