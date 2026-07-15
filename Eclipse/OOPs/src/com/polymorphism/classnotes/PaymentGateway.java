package com.polymorphism.classnotes;

public class PaymentGateway {
	
	void processPayment(String cardNumber) {
		System.out.println("Pay Using a Credit Card");
	}
	
	void processPayment(String upiId, double amount) {
		System.out.println("Pay Using a UPI");
	}
	void processPayment(String walletId,int otp, double amount) {
		System.out.println("Pay Using a WALLET");
	}
	

}
