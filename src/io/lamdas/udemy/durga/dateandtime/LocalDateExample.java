package io.lamdas.udemy.durga.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateExample {
	
	
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		LocalDateTime myLocalDateTime = LocalDateTime.of(1996, 12, 23, 19, 30, 00);
		System.out.println(myLocalDateTime);
		System.out.println("After 10 months -> " + localDate.plusMonths(10));
	}
	
}
