package com.constructor.notes;

public class Company extends Employee1 {
	
	String companyName;
	static int count = 0;
	
	static {
		System.out.println("Company.Inside static Ib");
	}
	
	public Company(String _companyName) {
		super();
		//iib
		
		this.companyName = _companyName;
		
		System.out.println("Company Name:"+companyName);
		
	}
	void print(){
		System.out.println(Company.count);
	}
	{
		count++;
		System.out.println("Company.Inside Instance Ib");
	}

}
