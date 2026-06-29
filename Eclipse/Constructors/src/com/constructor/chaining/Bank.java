package com.constructor.chaining;

public class Bank {

	String bankName;
	
	 Bank(String _bankName) {
		 
		 this.bankName = _bankName;
		
		 System.out.println("Name of Bank:"+bankName);
	}
	
	public static void main(String[] args) {
		
		Customer c = new Customer("Sbi Bank", "Daiwik Arya", "aryadaiwik123", "admin@123", 10000);
		
	}

}
