package com.constructor.chaining;

class Employee{
	
	String name;
	
	public Employee(String _name) {
		
		this.name = _name;
		System.out.println(name +" is an Employee");
		
	}
	
}

public class Manager extends Employee {

	String department;
	
	public Manager(String _name, String _department) {
		super(_name);
		
		this.department = _department;
		
		System.out.println(name+" is a manager of "+_department);
	}
	
	public static void main(String[] args) {
		
		Manager manager = new  Manager("Daiwik", "Backended");

	}

}
