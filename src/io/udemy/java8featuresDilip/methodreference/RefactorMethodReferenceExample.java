package io.udemy.java8featuresDilip.methodreference;

import io.udemy.java8featuresDilip.data.Student;
import io.udemy.java8featuresDilip.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
	
	static Predicate<Student> studentPredicate = RefactorMethodReferenceExample::greaterThanGradeLevel;
	
	public static boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel() >=3;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(studentPredicate.test(StudentDataBase.studentSupplier.get()));
	
	}
}
