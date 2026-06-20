
package com.bank.account;

//import com.bank.account.Interest;

public class BankApp
{
    public static void main(String[] args)
    {
        // amount from command line
		double amount= Double.parseDouble(args[0]);
        // print interest
		
		double interest = Interest.calculateInterest(amount);
		System.out.println("Interest::"+interest);
    }
}