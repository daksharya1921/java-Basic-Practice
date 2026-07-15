package com.polymorphism.classnotes;

public class PaymentGatewayUser {

	public static void main(String[] args) {
		
		PaymentGateway user;
		user = new PaymentGateway();
		
		user.processPayment("2346-2342-2342-2143");
		user.processPayment("daiwik@upi", 50);
		user.processPayment("aryadaiwik", 102132, 200);

	}

}
