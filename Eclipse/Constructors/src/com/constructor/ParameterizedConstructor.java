package com.constructor;

public class ParameterizedConstructor {
	String name;
	int age;
	
	
	public ParameterizedConstructor(String _name, int _age) {
		
		// TODO Auto-generated method stub
		this.name = _name;
		this.age = _age;

	}

	public static void main(String[] args) {
		
		ParameterizedConstructor pC1 = new ParameterizedConstructor("Raj Rahul", 23);
		
		ParameterizedConstructor pC2 = new ParameterizedConstructor("Daiwik Arya", 21);
		
		
		
	}

}
