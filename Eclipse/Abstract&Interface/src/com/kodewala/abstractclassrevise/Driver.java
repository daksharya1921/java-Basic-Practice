package com.kodewala.abstractclassrevise;

public class Driver {
	
	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();
		processor.processPayment(new UPIPayment());
		System.out.println();
		System.out.println("************************************************");
		System.out.println();
		processor.processPayment(new UPIPayment());
	}

}
