package io.lamdas.udemy.durga.section6;

public class Employee {
	
	private String name;
	private String title;
	private int salary;
	private String city;
	
	public Employee(String name, String title, int salary, String city) {
		this.name = name;
		this.title = title;
		this.salary = salary;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", title='" + title + '\'' + ", salary=" + salary + ", city='" + city + '\'' + '}';
	}
}
