package io.udemy.java8featuresDilip.functionalinterfaces;

import io.udemy.java8featuresDilip.data.Student;
import io.udemy.java8featuresDilip.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
	
	static Predicate<Student> studentPredicate = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> studentGpaMoreThan = (s) -> s.getGpa() >= 3.9;
	
	public static void filterStudentByGradeLevel() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student -> {
			if(studentPredicate.test(student)){
				System.out.println(student);
			}
		}));
	}
	
	public static void filterStudentByGpaLevel() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student -> {
			if(studentGpaMoreThan.test(student)){
				System.out.println(student);
			}
		}));
	}
	
	public static void main(String[] args) {
		filterStudentByGradeLevel();
		System.out.println("Now printing with GPA");
		filterStudentByGpaLevel();
	}
}
