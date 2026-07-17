package com.aggregation.hasa.tpoint.example.realtime;

public class Driver {
	
	public static void main(String[] args) {
		Address address1 = new Address("Kolkata", "WB", "India");
		Address address2 = new Address("BSF", "Bihar", "India");
		
		Employee employee1, employee2;
		employee1 = new Employee(231, "Daiwik Arya", address1);
		employee2 = new Employee(777, "Daksh Arya", address2);
		
		employee1.display();
		System.out.println("*******************************************");
		employee2.display();
				 
	}

}
