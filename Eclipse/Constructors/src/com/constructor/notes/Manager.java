package com.constructor.notes;

class Employee {

	String name;
	
	//Employee Constructors
	public Employee(String _name) {
		
		this.name = _name;
		System.out.println(name+" is a Employee");
		
	}
	{
		System.out.println("Employee.enclosing_method()");
	}
}


public class Manager extends Employee {
	
	String department;
	
	static int count = 0;
	
	//Constructor
	public Manager(String _name, String _department) {
		
		super(_name);
		this.department = _department;
		System.out.println(_name+" is a manager of "+department);
	}
	
	{
		count++;
	}
	{
		System.out.println("Manager.enclosing_method()");
	}

	public static void main(String[] args) {
		
		
		//Manager m = new Manager("John", "CSE");
		System.out.println("Object on Manager: "+Manager.count);
		Employee e = new Employee("John");
	}

}
