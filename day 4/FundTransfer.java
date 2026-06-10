public class FundTransfer
{
	// methods to transfer funds between accounts
	public void transfer(int fromAccount, int toAccount, double amount)
	{	// this condition will check if amount is more than 0 or not
		if(amount > 0)
		{
			System.out.println("Transferred INR "+amount+" from "+fromAccount+" to Account " +toAccount);
		}
		// if if condition is not met then its will excute else one
		else
		{
			System.out.println("Invalid transfer amount.");
		}
	}
	
	public static void main(String args[])
	{	// check the input is given or not 
		if(args.length != 3)
		{
			System.out.println("Please Enter a valid Details.");
			return;
		}
		
		// its take input as String
		String fromAccountStr = args[0];
		String toAccountStr = args[1];
		String amountStr = args[2];
		
		// convert String to int using parseInt
		int fromAccount = Integer.parseInt(fromAccountStr);
		int toAccount = Integer.parseInt(toAccountStr);
		
		// covert String to Double
		double amount = Double.parseDouble(amountStr);
		
		//this created a copy of class and make its as an object
		FundTransfer fundTransfer = new FundTransfer();
		// this will give or provide input to transfer method and give o/p
		fundTransfer.transfer(fromAccount, toAccount, amount);
	}
}