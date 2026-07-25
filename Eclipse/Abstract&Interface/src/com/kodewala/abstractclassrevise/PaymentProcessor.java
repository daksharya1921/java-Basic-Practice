package com.kodewala.abstractclassrevise;

public class PaymentProcessor {
	
	public void processPayment(PaymentSystem system) {
		system.checkStatus();
		system.suspendPayment();
		system.stopPayment();
	}

}
