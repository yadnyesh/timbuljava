package io.java9.in28minutes;

public class StudentRunner {
	
	public static void main(String[] args) {
		int[] marks = {98, 99, 100};
		
		Student student = new Student("Yadnyesh", marks);
		
		int number = Student.getNumberOfMarks();
		System.out.println(number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of Marks: " + sum);
	}
}
