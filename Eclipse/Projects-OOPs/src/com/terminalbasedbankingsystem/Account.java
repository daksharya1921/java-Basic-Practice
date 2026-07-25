package com.terminalbasedbankingsystem;

/*  
 * Terminal-Based Banking System

Core Concepts: Encapsulation, Static Members, and Inheritance.


Real-World Application: This is a console application where a user can create an account, deposit money, withdraw money, and check their balance.


Implementation Idea: Keep the balance variable strictly private and only allow modifications through deposit() and withdraw() methods.
 */
public class Account {
	
	
	public static final String BANK_NAME = "SBI";
	
	static {System.out.println("Welcome To "+BANK_NAME+" !!");}
	
	//private variable for data hiding
	private double balance;
	
	// primetrsized constructor for object
	public Account(double balance) {
		this.balance = balance;
	}
	
	//withdrawal process
	public double withdraw(double amount) {
		if( balance >= amount) {
			balance -= amount;
		}
		
		return balance ;
	}
	
	//deposit process
	public double deposit(double amount ) {
		if(amount > 0) {
			balance += amount;
		}
		
		return balance ;
	}
	
	
	//showing the balance
	public double showBalance() {
		return balance;
	}

}
