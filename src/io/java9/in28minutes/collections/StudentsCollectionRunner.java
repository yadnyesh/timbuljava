package io.java9.in28minutes.collections;

import java.sql.SQLOutput;
import java.util.*;

public class StudentsCollectionRunner {
	
	public static void main(String[] args) {
		List<Student> studentList = List.of(new Student(100,"Yadnyesh"),
											new Student(2, "AName 2"),
											new Student(4, "X Name"),
											new Student(8, "B Name"),
											new Student(1, "H Name"));
		System.out.println(studentList);
		List<Student> studentsAl = new ArrayList<>(studentList);
		Collections.sort(studentsAl);
		System.out.println("Asc --> " + studentsAl);
		Collections.sort(studentsAl, new DescStudentComparator());
		System.out.println("DescStudentComparator: " + studentsAl);
	}
}
