package com.oops.encapsulation.liveclass.bank;

public class Account {
	


	private double balance;
	//private String userName;
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setWithdraw(double withdraw) {
		if(balance <= withdraw) {
		balance -= withdraw;
		System.out.println("Debit Amount: "+withdraw);
		System.out.println("Balance After Withdraw: "+balance);
		}
		else {
			System.out.println("Infficuent balance ");
		}
	}
	
	public  void setDeposit(double deposit) {
		if(deposit > 0) {
			balance += deposit;
			System.out.println("Credit Amount : "+deposit);
			System.out.println("Balance After Credit :"+balance);
		}
	}
	
}
