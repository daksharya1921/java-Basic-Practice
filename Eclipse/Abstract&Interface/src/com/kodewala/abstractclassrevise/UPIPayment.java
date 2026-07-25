package com.kodewala.abstractclassrevise;

public class UPIPayment extends PaymentSystem {

	@Override
	public void pay() {
		System.out.println("UPIPayment.pay()");
		
	}

	@Override
	public void suspendPayment() {
		System.out.println("UPIPayment.suspendPayment()");
		
	}

	@Override
	public void stopPayment() {
		System.out.println("UPIPayment.stopPayment()");
		
	}

}
