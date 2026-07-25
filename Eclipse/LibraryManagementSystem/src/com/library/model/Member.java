package com.library.model;

public class Member extends Person{

	private String phone;
	
	public Member(int id, String name, String phone) {
		super(id, name);
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public void displayPerson() {
		System.out.println("Member");
		System.out.println("ID : "+getId());
		System.out.println("Name : "+getName());
		System.out.println("Phone : "+phone);
	}
}
