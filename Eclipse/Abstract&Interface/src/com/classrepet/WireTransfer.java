package com.classrepet;

public class WireTransfer implements IPaymentSystem {

	@Override
	public void pay() {
		System.out.println("WireTranfer.pay()");
		
	}

	@Override
	public void settle() {
		//calculateTxnFees(50000);
	//	TxnFeesUtils.calculateTxnFees(50500,5); -> its was before java 8 
		IPaymentSystem.calculateTxnFees(2000,5);
		System.out.println("WireTranfer.settle");
		
	}
	
	// - > these had to use in another UTIL class where we implements its before java 8
	// -> class name is TxnFeesUtils.java
//	private int calculateTxnFees(int amount) {
//		
//		int txnFee = amount*5/100;
//		return txnFee;
//	}

}
