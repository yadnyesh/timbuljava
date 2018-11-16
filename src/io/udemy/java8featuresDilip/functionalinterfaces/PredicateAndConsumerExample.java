package io.udemy.java8featuresDilip.functionalinterfaces;

import io.udemy.java8featuresDilip.data.Student;
import io.udemy.java8featuresDilip.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
	
	Predicate<Student> studentPredicateGrade = ((student) -> {
		return student.getGradeLevel() >= 3;
	});
	
	Predicate<Student> studentPredicateGpa = ((student) -> {
		return student.getGpa() >= 3.9;
	});
	
	BiPredicate<Integer, Double> studentBiPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
	
	BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
	
	Consumer<Student> studentConsumer = ((student) -> {
		if(studentPredicateGrade.and(studentPredicateGpa).test(student)){
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	});
	
	Consumer<Student> studentBiPredicateConsumer = ((student) -> {
		if(studentBiPredicate.test(student.getGradeLevel(), student.getGpa())){
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	});
	
	public void printNameAndActivities(List<Student> students) {
		students.forEach(studentBiPredicateConsumer);
	}
	
	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().printNameAndActivities(studentList);
		
	}
}
