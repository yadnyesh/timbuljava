package io.udemy.java8featuresDilip.functionalinterfaces;

import io.udemy.java8featuresDilip.data.Student;
import io.udemy.java8featuresDilip.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
	
	public static void main(String[] args) {
		Supplier<Student> studentSupplier = () -> {
			return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
		};
		
		Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
		
		System.out.println("Student is: " + studentSupplier.get());
		
		System.out.println("Students are: " + listSupplier.get());
	}

}
