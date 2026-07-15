package com.polymorphism.classnotes;

public class CCPay extends Payment {
	
	@Override
	void processPayment(double amount) {
		System.out.println("Processing CCPay payment of "+amount);
	}
	

}
