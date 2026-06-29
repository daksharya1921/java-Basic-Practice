package com.constructor.chaining;

public class Customer extends Bank {
	
	String bankName;
	String customerName;
	String userId;
	String password;
	int balance;
	
	
	
	 Customer(String _bankName, String _customerName, String _userId, String _password, int _balance) {
		
		 super(_bankName);
		 
		 
		 this.bankName = _bankName;
		
		 this.customerName = _customerName;
		 this.userId = _userId;
		 this.password = _password;
		 this.balance = _balance;
		 
		 printCustomerDetails( customerName,  userId,  password,  balance );
		 
	}
	 
	 void printCustomerDetails(String customerName, String userId, String password, int balance ) {
		 
		 System.out.println("Customer Name::"+customerName+"\nUser Id::"+userId+"\nPassword::"+password+"\nAccount Balance::"+balance);
		 
	 }

}
