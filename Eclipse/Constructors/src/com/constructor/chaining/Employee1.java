package com.constructor.chaining;

 class Employee1 extends Company {
	String companyName;
	String employeeName;
	double employeeSalary;
	
	
	 Employee1(String companyName ,String _employeeName, double _employeeSalary) {
		super(companyName);
		 this.employeeName = _employeeName;
		 this.employeeSalary = _employeeSalary;
		
		 print(employeeName, employeeSalary);
	}
	 
	 void print(String employeeName, double employeeSalary) {
		 
		 System.out.println("Name of the Employee :"+employeeName+"\nEmployee Salary: "+employeeSalary);
	 }
	 
	 
	 

}
