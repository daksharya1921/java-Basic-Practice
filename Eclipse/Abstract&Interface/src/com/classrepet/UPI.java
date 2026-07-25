package com.classrepet;

public class UPI implements IPaymentSystem {

	@Override
	public void pay() {
		System.out.println("UPI.pay()");

	}

	@Override
	public void settle() {
		//calculateTxnFees(20023);
	//	TxnFeesUtils.calculateTxnFees(20023, 10); -> -> its was before java 8
		
		//After java 8 we have static method in interface to use betweens all class
		IPaymentSystem.calculateTxnFees(20023, 10);
		System.out.println("UPI.settle()");

	}

	@Override
	public void checkValue() {
		System.out.println("UPI.checkValue()");
	}

	// - > these had to use in another UTIL class where we implements its before
	// java 8
	// -> class name is TxnFeesUtils.java
	// -> this method is common in every class so before java 8 used to make on util
	// class and we used to call it from there.
//	private int calculateTxnFees(int amount) {
//		int txnFee = amount * 10 / 100;
//		return txnFee;
//	}
}
