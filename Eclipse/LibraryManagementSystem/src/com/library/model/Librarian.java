package com.library.model;

public class Librarian extends Person {
	
	private String employeeId;
	
	public Librarian(int id, String name, String employeeId) {
		super(id,name);
		this.employeeId =  employeeId;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public void displayPerson() {
		
		System.out.println("Librarian");
		System.out.println("ID : "+getId());
		System.out.println("Name: "+getName());
		System.out.println("Employee ID : "+employeeId);
		
	}

}
