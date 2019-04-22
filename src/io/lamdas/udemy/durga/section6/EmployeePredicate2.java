package io.lamdas.udemy.durga.section6;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicate2 {
	
	public static void main(String[] args) {
		ArrayList<Employee> employeeArrayList = new ArrayList<>();
		populate(employeeArrayList);
		
		Predicate<Employee> isEmployeeManagerPredicate = employee -> employee.getTitle().equals("Manager");
		System.out.println("Print All Managers");
		display(isEmployeeManagerPredicate, employeeArrayList);
	}
	
	public static void populate(ArrayList<Employee> employees) {
		employees.add(new Employee("Durga", "CEO", 30000, "Hyderabad"));
		employees.add(new Employee("Sunny", "Manager", 20000, "Hyderabad"));
		employees.add(new Employee("Mallika", "Manager", 40000, "Bangalore"));
		employees.add(new Employee("Kareena","Lead",15000,"Hyderabad"));
		employees.add(new Employee("Katrina","Lead",15000,"Bangalore"));
		employees.add(new Employee("Anushka","Developer",10000,"Hyderabad"));
		employees.add(new Employee("Kanushka","Developer",10000,"Hyderabad"));
		employees.add(new Employee("Sowmya","Developer",10000,"Bangalore"));
		employees.add(new Employee("Ramya","Developer",10000,"Bangalore"));
	}
	
	public static void display(Predicate<Employee> predicate, ArrayList<Employee> employeeArrayList) {
		
		for (Employee employee: employeeArrayList) {
			if(predicate.test(employee)){
				System.out.println(employee);
			}
		}
		System.out.println("***********************************************************************s");
	
	}
}

