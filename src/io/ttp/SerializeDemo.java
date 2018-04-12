package io.ttp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	
	public static void main(String[] args) {
		serializeEmployee();
	}
	
	private static void serializeEmployee() {
		Employee e = new Employee();
		e.name = "Yadnyesh";
		e.address = "Goa";
		e.SSN = 12314;
		e.number = 101;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(e);
			objectOutputStream.close();
		} catch (IOException e1){
			System.out.println(e1);
			e1.printStackTrace();
		}
	}
	
	private static void deserializeEmployee() {
		Employee e = null;
		try {
			FileInputStream fileInputStream = new FileInputStream("employee.ser");
			
		} catch(IOException e1){
			e1.printStackTrace();
		}
	}
	
}
