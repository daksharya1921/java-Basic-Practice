package com.inheritance.tpoint;

class Employee{
	float salary = 40000;
}

class Programmer extends Employee{
	
	int bouns = 10000;
	
}

public class Main {
	
	

	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		System.out.println("Programmer salary is "+p.salary);
		System.out.println("Programmer Bouns is "+p.bouns);

	}

}
