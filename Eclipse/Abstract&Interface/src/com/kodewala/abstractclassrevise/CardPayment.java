package com.kodewala.abstractclassrevise;

public class CardPayment extends PaymentSystem {

	@Override
	public void pay() {
		System.out.println("CardPayment.pay()");
		
	}

	@Override
	public void suspendPayment() {
		System.out.println("CardPayment.suspendPayment()");
		
	}

	@Override
	public void stopPayment() {
		System.out.println("CardPayment.stopPayment()");
		
	}

}
