package com.listexample.arraylistexample.classcode2;

import java.io.Serializable;

public class Student implements Serializable 
{
	
	private String fullName;
	private Address address;
	
	public Student(String fullName,Address address) {
		this.fullName = fullName;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public String getAddress() {
		 
		return  address.getLine1() +"\n"+address.getLine2() ;
	}
	
	

}
