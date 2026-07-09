package com.walmart;

public class Employee {

	public String empName;
	public String empId;
	public double basicSalary;
	
	public Employee(String _empName,String _empId,double _basicSalary) {
		this.empName = _empName;
		this.empId = _empId;
		this.basicSalary = _basicSalary;
	}
	
	public void empDetails() {
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee ID:"+empId);
		System.out.println("Employee Basic Salary:"+basicSalary);
	}
	
	public void calculateSalary() {
		double salary = basicSalary*1.5;
		System.out.println("Employee Salary"+salary);
	}
	
}
