package io.yadnyesh.javanotesforprofessional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class UtilToSqlConversion {
	
	public static void main(String[] args) {
		java.util.Date utilDate = new java.util.Date();
		System.out.println("java.util.Date is : " + utilDate);
		java.sql.Date sqlDate = convert(utilDate);
		System.out.println("java.sql.Date is : " + utilDate);
		DateFormat df = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
		System.out.println("Formatted date is "  + df.format(utilDate));
		
		
		// LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.toLocalDate());
		
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
		System.out.println("Print Date: " + dateFormat.format(today));
	}
	
	private static java.sql.Date convert (java.util.Date utilDate) {
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		return sqlDate;
	}
	
	// java.util.Date has both Date and Time
	// java.sql.Date has only Date
}
