package com.abstraction.classnotes;

public class User {

	public static void main(String[] args) {
		
		PaymentProcessor processor =new PaymentProcessor();
		
		int balance = processor.checkBalance("Hello","akdjl");
		System.out.println("Balance:"+balance);
		
		
		//processor.getBalanceFromDB();
		
//		int balance = processor.getBalanceFromDB();
//		System.out.println("Balance:"+balance);
	}

}
