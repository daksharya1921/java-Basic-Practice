package com.constructor.chaining;

public class Company {

	String companyName;
	
	public Company(String _companyName) {
		//super(_companyName);
		this.companyName = _companyName;
		
		System.out.println("Name of Company :"+companyName );
	}
	
	
	
	public static void main(String[] args) {

	//Employee1 e = new Employee1("Wipro");
		Employee1 e = new Employee1("Wipro", "Raj", 1847.09d);
	}

}
