package com.encapsulation.revision;

public class Account {
	
	private int balance;
	private String userId;
	
    public void setBalance(int balance) {
    	if(balance>0) {
		this.balance = balance;
		}
	}
//	public int getBalance() {
//		return balance;
//	}
	
	public void setUserId(String _userId) {
		if(_userId.startsWith("tcs_")) {
		this.userId = _userId;
		}
	}
	
//	public String getUserId() {
//		return userId;
//	}
	
	void showBalance() {
		System.out.println("User Id:"+userId+
							"\nBalance:"+balance);
	}

}
