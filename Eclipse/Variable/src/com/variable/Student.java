package com.variable;

//public class JavaVariable2 {
 
	
	
	
//}

// Reference Data Type (Non Pritimive)
//1.>Class
//2.>String
//3.>Interface
//4.>Array
//And So ON

class Employee {
	int empId;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
}

public class  Student {
	
	
	private static void modify(Employee employee) {
		employee.empId = 30;
	}
	
	public static void main(String[] args) {
		
		Employee empObject = new Employee();
		empObject.empId = 10;
		modify(empObject);
		System.out.println(empObject.empId);
		
	}
}