package com.kodewala.abstractclass.classnotes;

abstract class PaymentStatus {
	int balance;

	public PaymentStatus(int balance) {
		this.balance = balance;
	}

	public abstract void doTxn();

	public abstract void suspendTxn();

	public void showBalance() {
		System.out.println("Heloo this is ur balance:" + balance);
	}

}

class UPIPayment extends PaymentStatus {

	UPIPayment(int balance) {
		super(balance);
	}

	public void doTxn() {
		System.out.println("UPIPayment.doTxn()");
	}

	public void suspendTxn() {
		System.out.println("UPIPayment.suspendTxn()");
	}

	public void displayInfo() {
		System.out.println("UPIPayment.displayInfo()");
	}
}


// ********************************Abstarct class Vs Final class*************************************************
// abstract must have child class that will Implements 
// Final Class MUST NOT have sub class or child Class 

public class AbstractClassExample {

	public static void main(String[] args) {

		// PaymentStatus paymentStatus = new PaymentStatus(); -> cannot create object of
		// abstract class cuz its partily implemented
		//PaymentStatus paymentStatus;
		UPIPayment	paymentStatus = new UPIPayment(1000);
		paymentStatus.doTxn();
		paymentStatus.suspendTxn();
		paymentStatus.showBalance();
		paymentStatus.displayInfo();

	}
}
