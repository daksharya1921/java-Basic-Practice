package com.constructor.chaining;

public class Account extends Object{

	public Account() {
		super();
		System.out.println("I'm the inside the Constructor!");
	}
	
	public static void main(String[] args) {
		Account account = new Account();
		//new Account();
	}

}
