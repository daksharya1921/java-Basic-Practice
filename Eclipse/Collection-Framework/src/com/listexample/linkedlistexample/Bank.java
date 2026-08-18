package com.listexample.linkedlistexample;

public class Bank {
	
	private String bankName,accountHolderName,ifscCode;
	private int balance;
	
	public Bank(String bankName,String accountHolderName,String ifscCode,int balance) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		
	}
	
	public String getDetails(){
		return "Bank name: "+bankName+"\nAccount Holder Name: "+accountHolderName
				+"\nIFSC CODE: "+ifscCode;
	}
	
	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", accountHolderName=" + accountHolderName + ", ifscCode=" + ifscCode
				+ "]";
	}
	
	

}
