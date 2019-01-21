package io.lamdas.udemy.durga;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeLambda {
	
	public static void main(String[] args) {
		Employee e3 = new Employee(100, "Durga");
		ArrayList<Employee> employeeArrayList = new ArrayList<>();
		employeeArrayList.add(new Employee(200, "Deepika"));
		employeeArrayList.add(new Employee(1000, "Ranvir"));
		employeeArrayList.add(new Employee(40, "Singh"));
		employeeArrayList.add(new Employee(10, "Kher"));
		employeeArrayList.add(new Employee(67, "Tammannah"));
		System.out.println("Before sorting: " + employeeArrayList);
		Collections.sort(employeeArrayList, (e1, e2) -> e1.employeeNo < e2.employeeNo? -1 : e1.employeeNo > e2.employeeNo ? 1 : 0);
		System.out.println("Before sorting: "+ employeeArrayList);
	}
	
}
