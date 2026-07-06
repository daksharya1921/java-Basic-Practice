package com.variable;

public class TypeOfVariable {

	int memberVariable; //member Variable or instane variable
	static int staticVariable = 100; //static variable or class variable
	
	public TypeOfVariable() {
		// TODO Auto-generated constructor stub
	}
	
	// constructor
	public TypeOfVariable(int a) {
		// TODO Auto-generated constructor stub
	}
	
	public void dummyMethod() {
		byte localVariable = 100; // local variable
		System.out.println(localVariable);
	}
	
	//method Parameter 
	public int dummyMethod2(int a /*method Parameter*/ , int b) {
		return a+b;
	}
	
}
