package com.meta;

public class User {
	
	 String name;
	 String email;
	
	 User(String _name, String _email) {
		
		this.name = _name;
		this.email = _email;
	}
	
	 void showUserDetails() {
		
		System.out.println("Name: "+name+"\nEmail: "+email);
		
	}
	 
	 //till Default access modifier will work Inheritance instilize value using constructors

}
