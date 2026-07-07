package com.string.bufferbuilderexample;

import java.util.Date;
import java.time.LocalDate;


public class DyanmicSqlQuery {
	
	
	String queryGenerator(String department, double salaryRange, LocalDate joiningDate) {
		
		LocalDate d1 = LocalDate.of(2026, 7, 7);
		StringBuilder query = new StringBuilder();
		query.append("SELECT * FROM employees");
		if(department != null) {
			query.append(" WHERE 1=1 AND department = '"+department+"'");
			
		}
		if(salaryRange > 15000) {
			query.append(" AND salary >"+salaryRange);
		}
		if(joiningDate.isAfter(d1)) {
			query.append(" joining_date >='"+joiningDate+"'");
			
		}
		query.append(";");
		
		
		
		
		return query.toString();
	}

}
