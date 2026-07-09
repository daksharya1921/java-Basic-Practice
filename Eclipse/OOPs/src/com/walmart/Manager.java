package com.walmart;

public class Manager extends Employee {
	
	public double bonus;
	
	public Manager(String _empName,String _empId,double _basicSalary, double _bonus) {
		super(_empName, _empId, _basicSalary);
		this.bonus = _bonus;
		
		
	}
	
	@Override
	public void calculateSalary() {
		double salary = basicSalary+bonus;
		System.out.println("Employee Salary:"+salary);
	}

}
