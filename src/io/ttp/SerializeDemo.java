package io.ttp;

import java.io.FileOutputStream;
import java.io.IOException;

public class SerializeDemo {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Yadnyesh";
		e.address = "Goa";
		e.SSN = 12314;
		e.number = 101;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
		} catch (IOException e){
			System.out.println(e);
		}
	}
}
