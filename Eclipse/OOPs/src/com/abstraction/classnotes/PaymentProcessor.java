package com.abstraction.classnotes;

public class PaymentProcessor {

	
	public int checkBalance(String userId, String password) {
		
		//Connect to db
		connectWithDb();
		
		
		//get User And Password From DB
		getUserAndPasswordFromDb();
		
		//validate
		validate();
		
		
		//get Balance From Db
		int balance = getBalanceFromDB();
		
		
		
		
		
		return balance;
	}
	
	
	private void connectWithDb() {
		
		System.out.println("Connecting with Db");
	}
	
	private void getUserAndPasswordFromDb() {
		System.out.println("Fetching user/password from DB");
	}
	
	private boolean validate() {
		return true;
	}
	
	private int getBalanceFromDB() {
		return 1200;
	
	
//	public void connectWithDb() {
//		
//		System.out.println("Connecting with Db");
//	}
//	
//	public void getUserAndPasswordFromDb() {
//		System.out.println("Fetching user/password from DB");
//	}
//	
//	public boolean validate() {
//		return true;
//	}
//	
//	public int getBalanceFromDB() {
//		return 1200;
	
	
	}
	
	
}
