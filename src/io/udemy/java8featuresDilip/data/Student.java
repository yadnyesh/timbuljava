package io.udemy.java8featuresDilip.data;

public class Student {
	private String name;
	private String gradeLevel;
	private String gpa;
	private String gender;
	
	public Student(String name, String gradeLevel, String gpa, String gender) {
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGradeLevel() {
		return gradeLevel;
	}
	
	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
	public String getGpa() {
		return gpa;
	}
	
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", gradeLevel='" + gradeLevel + '\'' + ", gpa='" + gpa + '\'' + ", gender='" + gender + '\'' + '}';
	}
}
