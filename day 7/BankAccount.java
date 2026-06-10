import java.util.Scanner;

class BankAccount
{
	static double interestRate = 6.5;
	
	String accountHolder;
	double balance;
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		BankAccount bankAccount = new BankAccount();
		
		System.out.print("Enter account holder name: ");
		bankAccount.accountHolder = scanner.next();
		
		System.out.print("Enter balance: ");
		bankAccount.balance = scanner.nextDouble();
		
		bankAccount.calcInterset();
		
	
		scanner.close();
	}
	
	public void calcInterset()
	{
		double interest = balance * interestRate / 100;
		interest = balance * interestRate / 100;
		
		System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest earned: " + interest);
    }
	
}