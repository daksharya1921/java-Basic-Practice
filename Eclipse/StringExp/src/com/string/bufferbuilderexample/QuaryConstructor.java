package com.string.bufferbuilderexample;

public class QuaryConstructor {
	
	public static String MSG1 = "SELECT * from employee";
	public static String MSG2 = " WHERE emp_ID = ";
	public static String MSG3 = " WHERE salary > ";
	
	
	
	
	public String printQuary(String emp_Id, double salary) {
		
		StringBuffer query = new StringBuffer(MSG1);
		
		if(emp_Id != null ) {
			query.append(MSG1).append(emp_Id);
			
		}
		if(salary >  0 ) {
			query.append(MSG3).append(salary);
			
		}
		query.append(";");
		
		return query.toString();
		
		
		
		
	}

}
