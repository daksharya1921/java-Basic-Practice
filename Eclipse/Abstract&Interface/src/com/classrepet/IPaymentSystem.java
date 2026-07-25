package com.classrepet;

public interface IPaymentSystem {

	void pay();
	void settle();
	
	//*******************after java 7 or java 8*************************
	public default void checkValue() {
		// -> any code like conntecting db or anything
		// ->  caused code dulpuction 
		
		
		//*****************************java 9 ***************************
		 connectDB();
		 
		System.out.println("IPaymentSystem.checkBalance()");
	}
	
	//After java 8 we have static method in interface to use betweens all class
	public static int calculateTxnFees(int amount, int rate) {
		// -> any code like conntecting db or anything -
		// ->  caused code dulpuction
		
		//*****************************java 9 ***************************
		 touchDB();
		 
		int txnFee = amount * rate / 100;
		return txnFee;
	}
	
	//*******************after java 8 or java 9*************************
	// so in java 9 java introduce  private method in interface
	private void connectDB() {
		// -> any code like conntecting db or anything -
	}
	
	private static void touchDB() {
		// -> any code like conntecting db or anything -
	}
	
	
}
