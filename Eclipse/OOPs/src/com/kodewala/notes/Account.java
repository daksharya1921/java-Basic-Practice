package com.kodewala.notes;

public class Account {
	
	double balance;
	
	public Account(double _balance) {
		this.balance = _balance;
	}
	
	public void showBalance() {
		System.out.println("Balance:"+balance);
	}

}
