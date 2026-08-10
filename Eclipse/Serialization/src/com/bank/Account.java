package com.bank;

import java.io.Serializable;

public class Account implements Serializable//, Cloneable 
{
	

	private String userId;
	private String name;
	private String password;
	private String ifscCode;
	private int balance;

	public Account(String _userId, String _name, String _password, String _ifscCode, int _balance) {
		this.userId = _userId;
		this.name = _name;
		this.password = _password;
		this.ifscCode = _ifscCode;
		this.balance = _balance;
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public int getBalance() {
		return balance;
	}
	
	
//	public Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
