package com.banking;

public class Account {
	
	public double balance;
	public String userId;
	
	
	
	public Account(double _balance, String _userId) {
		this.balance = _balance;
		this.userId = _userId;
	}
	
	public void showDetails() {
		System.out.println("user Id:"+userId+"\nBalance:"+balance);
	}

}
