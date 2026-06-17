/*
Question 2: Bank Transaction

Create a class Bank.

Requirements:

Method: deposit(double amount)
Method: transactionSuccess()
transactionSuccess() returns true
deposit() should call transactionSuccess() and return "Amount Deposited"
*/
class Bank{
	public static void main(String[] args)
	{	
		String depositStr = args[0];
		
		double deposit = Double.parseDouble(depositStr);
		
		System.out.println("Total  Amount::"+(Bank.deposit(deposit)));
	}
	static double deposit(double amount)
	{
		double bankBalance = 7000;
		double nowBankBalance = bankBalance+amount;
		System.out.println("Transaction Success::"+(Bank.transactionSuccess()));
		return nowBankBalance;
		
	}
	static boolean transactionSuccess()
	{
		boolean transactionProcess = true;
		
		return transactionProcess;
	}
	
}