package com.poly.classwork;

public class Driver {
	
	public static void main(String[] args) {
		
		Payment payment;
		PaymentProcessor process = new PaymentProcessor();
		
		payment = new PhonePayPayment();
		process.processPayment(payment);
		
		
	}

}
