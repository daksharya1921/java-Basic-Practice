package com.kodewala.abstractclassrevise;

public abstract  class PaymentSystem {

	public abstract void pay();
	public abstract void suspendPayment();
	public abstract void stopPayment();
	
	
	public void checkStatus() {
		System.out.println("PaymentSystem.checkStatus()");
	}
}
