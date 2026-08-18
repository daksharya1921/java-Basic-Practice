package com.revision.hashset;

import java.util.Set;
import java.util.HashSet;

public class Employee {
	
	
	 String name;
	
	public Employee(String name) {
		this.name= name;
	}
	
	@Override
	public int hashCode() {
		return 100; // forced to return same hashCode -> hashCollision Demonstration
	}
	
	@Override
	public String toString() {
		return name;
	}

}

class MainApp
{
	public static void main(String[] args)
	{
		Set<Employee> employees = new HashSet<Employee>();
		
		employees.add(new Employee("Daksh"));
		employees.add(new Employee("Daiwik"));
		
		System.out.println(employees);
		
	}
	
}