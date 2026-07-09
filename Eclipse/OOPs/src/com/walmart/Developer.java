package com.walmart;

public class Developer extends Employee {
	
	public double bounsDeveloper;
	public double increment;

	public Developer(String _empName, String _empId, double _basicSalary, double _bonus, double _increment) {
		super(_empName, _empId, _basicSalary);
		this.bounsDeveloper = _bonus;
		this.increment = _increment;

	}

	@Override
	public void calculateSalary() {
		double salary = basicSalary+(basicSalary*increment/100) + bounsDeveloper;
		System.out.println("Employee Salary:" + salary);
	}

}
