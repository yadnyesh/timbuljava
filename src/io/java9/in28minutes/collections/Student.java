package io.java9.in28minutes.collections;

import java.util.Comparator;

class DescStudentComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}
}


public class Student implements Comparable<Student>{
	private int id;
	private String name;
	
	public Student() {
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Student student) {
		return Integer.compare(this.id, student.id);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + '}' + '\n';
	}
	
}
