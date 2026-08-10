package com.practice;

import java.io.Serializable;

public class Bank implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String panNumber;
	private String aadharNumber;
	private int balance;
	
	Bank(String _name, String _panNumber,String _AadharNumber,int _balance){
		this.aadharNumber = _AadharNumber;
		this.panNumber = _panNumber;
		this.name = _name;
		this.balance = _balance;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPanNumber() {
		return panNumber;
	}
	
	public String getAadharNumber() {
		return aadharNumber;
	}

	public int getBalance() {
		return balance;
	}

	
}
