package io.yadnyesh.javanotesforprofessional;

public class UtilToSqlConversion {
	
	public static void main(String[] args) {
		java.util.Date utilDate = new java.util.Date();
		System.out.println("java.util.Date is : " + utilDate);
		java.sql.Date sqlDate = convert(utilDate);
		System.out.println("java.sql.Date is : " + utilDate);
	}
	
	private static java.sql.Date convert (java.util.Date utilDate) {
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		return sqlDate;
	}
}
