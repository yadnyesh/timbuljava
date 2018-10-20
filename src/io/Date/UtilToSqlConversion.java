package io.Date;

import org.jetbrains.annotations.NotNull;

import java.sql.SQLOutput;

public class UtilToSqlConversion {
	
	public static void main(String[] args) {
		java.util.Date utilDate = new java.util.Date();
		System.out.println("java.util.Date is: " + utilDate);
		java.sql.Date sqlDate = convert(utilDate);
		System.out.println("java.sql.Date is: " + sqlDate);
	}
	
	private static java.sql.Date convert(@NotNull java.util.Date uDate){
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		return sDate;
	}
	
}
