package io.Date;

import java.sql.SQLOutput;

public class UtilToSqlConversion {
	
	public static void main(String[] args) {
		java.util.Date utilDate = new java.util.Date();
		System.out.println("java.util.Date is: " + utilDate);
		java.sql.Date sqlDate = convert(utilDate);
	}
	
	private static java.sql.Date convert(java.util.Date uDate){
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		return sDate;
	}
	
}
