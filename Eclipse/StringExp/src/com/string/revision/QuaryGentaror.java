package com.string.revision;

import java.util.Scanner;

public class QuaryGentaror {
	
	
	final static String Q1 = "SELECT * from employee";
	
	void doDisplay(String emp_Id, Double salary) {
	//	
		StringBuffer query = new StringBuffer(Q1);
		//query.append();
		boolean hasCondition = false;
		if (emp_Id != null && !emp_Id.trim().isEmpty()) {
            query.append(" WHERE emp_ID = '").append(emp_Id).append("'");
            hasCondition = true;
        }

        if (salary != null && salary > 0) {
            if (hasCondition) {
                query.append(" AND salary > ").append(salary);
            } else {
                query.append(" WHERE salary > ").append(salary);
                hasCondition = true;
            }
        }
		query.append(";");
		
		System.out.println(query);
		
	}
	

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		QuaryGentaror qg = new QuaryGentaror();
		System.out.println("Ur Employee Id:");
		
		String emp_Id = s.nextLine();
		
		System.out.println("Ur Salary:");
		String salaryInput = s.nextLine(); // read as string to allow empty input
        Double salary = null;
        if (!salaryInput.trim().isEmpty()) {
            salary = Double.parseDouble(salaryInput);
        }
		
		qg.doDisplay(emp_Id, salary);
		
		s.close();
		
	}

}
