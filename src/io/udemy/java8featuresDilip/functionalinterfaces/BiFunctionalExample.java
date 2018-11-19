package io.udemy.java8featuresDilip.functionalinterfaces;

import io.udemy.java8featuresDilip.data.Student;
import io.udemy.java8featuresDilip.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionalExample {
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunctionStudentGpa = ((students, studentPredicate) -> {
		Map<String, Double> stringGradeMap = new HashMap<>();
		students.forEach(student -> {
			if(studentPredicate.test(student)){
				stringGradeMap.put(student.getName(), student.getGpa());
			}
		});
		return stringGradeMap;
	});
	
	public static void main(String[] args) {
		System.out.println(biFunctionStudentGpa.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.studentGpaMoreThan));
	}
	
}
