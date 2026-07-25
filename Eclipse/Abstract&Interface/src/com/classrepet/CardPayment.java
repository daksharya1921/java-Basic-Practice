package com.classrepet;

public class CardPayment implements IPaymentSystem {

	@Override
	public void pay() {
		System.out.println("CardPayment.pay()");

	}

	@Override
	public void settle() {
		//calculateTxnFees(20000);
	//	TxnFeesUtils.calculateTxnFees(20000, 2); -> -> its was before java 8 
		IPaymentSystem.calculateTxnFees(20002, 5);
		System.out.println("CardPayment.settle()");

	}

	// - > these had to use in another UTIL class where we implements its before
	// java 8
	// -> class name is TxnFeesUtils.java
//	private int calculateTxnFees(int amount) {
//		int txnFee = amount*2/100;
//		return txnFee;
//	}
}
