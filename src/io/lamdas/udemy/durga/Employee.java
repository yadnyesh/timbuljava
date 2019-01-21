package io.lamdas.udemy.durga;

public class Employee {
	int employeeNo;
	String employeeName;
	
	public Employee() {
	}
	
	public Employee(int employeeNo, String employeeName) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "Employee{" + "employeeNo=" + employeeNo + ", employeeName=" + employeeName + '}';
	}
}
