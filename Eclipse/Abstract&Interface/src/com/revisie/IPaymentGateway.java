package com.revisie;

public interface IPaymentGateway {

	default void validateTransaction() {
		log("Validating transaction...");
		System.out.println("Transaction valid");

	}

	static void checkServiceStatus() {
		log("Payment Service is active");
	}

	private static void log(String message) {
		System.out.println("[LOG] " + message);
	}
	
	void processPayment(double amount);

}

class CreditCardPayment implements IPaymentGateway{
	
	public void processPayment(double amount) {
		System.out.println("Paid  "+amount +" via Credit Card");
	}
	
}

class UPIPayment implements IPaymentGateway{
	
	public void processPayment(double amount) {
		System.out.println("Paid "+amount+" via UPI.");
	}
	
}

class PaymentApp{
	public static void main(String[] args) {
		IPaymentGateway.checkServiceStatus();
		
		IPaymentGateway cc = new CreditCardPayment();
		cc.validateTransaction();
		cc.processPayment(5000);
		
		IPaymentGateway upi = new UPIPayment();
		upi.validateTransaction();
		upi.processPayment(1500);
		
	}
}