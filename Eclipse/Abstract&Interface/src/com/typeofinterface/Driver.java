package com.typeofinterface;


/*
 *	Types of Interface 
 *	1.Normal Interface
 *	2.Marker Interface -> interface without any methods are called marker Interface
 *		->> Basically its empty or tag interface called
 *		->> Predefined in java example of marker Interface is ->Cloneable ,Seribilable
 *
 *	3.Functional Interface
 *	4.Nested Interface
 *
 *
 *	instanceOf-> obj is type of an 	Interface  or not 	 
 *
 * 
 */


class Employee implements Cloneable{
	
	// If we doesn't Implements its like implements Cloneable CloneNotSupportedException
	
	String name,location;
	
	public Employee(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class Driver {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee("Daiwik Arya", "IND");
		Employee e2 = (Employee) e1.clone();
		System.out.println(e2.name+" "+e2.location);
		
		GoldUser goldUser = new GoldUser();
		if(goldUser instanceof User) {
			System.out.println("Gold User is type of User");
		}
		else {
			System.out.println("No Implemention");
		}
		
	}

}
