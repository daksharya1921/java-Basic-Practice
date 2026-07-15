package com.polymorphism.classnotes;

public class PaymentServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment payment;
		
		payment = new UPIPayment();
		payment.processPayment(10);
		
		payment = new CCPay();
		payment.processPayment(10000);

	}

}
