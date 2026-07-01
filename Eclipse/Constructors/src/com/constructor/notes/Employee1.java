package com.constructor.notes;

public class Employee1 {
	
	String employeeName,employeeID, phoneNumber ; 
	
	static {
		System.out.println("Employee1.static ib()");
	}
	
	public Employee1() {
		this("John","IT45","45678");
		
	}
	public Employee1(String _employeeName, String _employeeID, String _phoneNumber) {
		
		this.employeeName = _employeeName;
		this.employeeID = _employeeID;
		this.phoneNumber = _phoneNumber;
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Id:"+employeeID);
		System.out.println("Employee PHone number:"+phoneNumber);


	}
	{
		System.out.println("Employee1.instance ib()");
	}
	

}
