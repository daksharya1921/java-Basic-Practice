package com.test.week8;



class Name {

	String accountHolder;



	public Name(String accountHolder) {

		super();

		this.accountHolder = accountHolder;

	}

	

}

class Bank implements Cloneable{

	Name name;

	int Balance ;

	String ifscCode;

	String branchName;

	public Bank(Name _name,int balance, String ifscCode, String branchName) {

		super();

		this.Balance = balance;

		this.ifscCode = ifscCode;

		this.branchName = branchName;

		this.name = _name;

	}



	@Override

	public Object clone() throws CloneNotSupportedException {

		

		return super.clone();

	}

}

public class Driver {

	

	public static void main(String[] args) throws CloneNotSupportedException{

	

		Name name = new Name("Abhijit Pradhan");

		Bank bank = new Bank(name, 2000, "PUNB52255", "PNBGMBD");

		Bank bank2;

		bank2 = (Bank) bank.clone();

		//System.out.println(bank2.name.accountHolder);

		bank2.name.accountHolder = "Biswajeet Pradhan";
		System.out.println(bank2.name.accountHolder);

		System.out.println(bank2.name.accountHolder);

}

}

