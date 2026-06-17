/* ATM Machine ⭐⭐
Features
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Concepts
int balance
double depositAmount
Scanner
switch-case
methods

*/

import java.util.Scanner;

class AtmMachine{
	
	static Scanner scanner = new Scanner(System.in);

	static int checkBalance(int balance){
	
		
		return balance;
	
	}
	
	static double depositAmount(int balance, double deposit){
		
		
		return balance=(int)(balance+deposit);
	
	}
	
	static double withdrawAmount(int balance , double withdraw){
	
		//double withdrawAmnt = (double)();
		if(withdraw > balance)
		{
			System.out.println("Insufficient Balance");
			return balance;
		}
		
		return balance=(int)(balance-withdraw);
	
	}
	
	static void exit(){
	
		System.out.println("ThankYou !!!!! ");
	
	}
	
	static int switchAtm(char button,int balance){
		//Scanner scanner = new Scanner(System.in);
		char b = button;
		switch(b){
			
			case 'C' :
				
				System.out.println("Balance ::"+checkBalance(balance));
				return balance;
			
			//break;
			
			case 'D' :
				System.out.println("Deposit::");
				double deposit = scanner.nextDouble(); 
				System.out.println("Updated Balance ::"+depositAmount(balance,deposit));
				return balance;
				
			
			//break;
			
			case 'W' :
				System.out.println("Withdraw::");
				double withdraw = scanner.nextDouble(); 
				System.out.println("Updated Balance ::"+withdrawAmount(balance,withdraw));
				return balance;
			
			//break;
			
			case 'E' :
				
				exit();
			
			
			break;
			default: 
				System.out.println("Please provide vaild Input");
				break;
		
		}
		//scanner.close();
		return balance;
	}
	
	
	
	public static void main(String[] args){
	
		
		

		System.out.println("Balance ::");
		int balance = scanner.nextInt();
		
		scanner.nextLine(); 
		
		//System.out.println("Input for the process ::");
		//char inputButton = scanner.nextLine().charAt(0);
		
		
		
		//switchAtm(inputButton,balance);
		
		while(true)
	{
		System.out.println("\nC - Check Balance");
		System.out.println("D - Deposit");
		System.out.println("W - Withdraw");
		System.out.println("E - Exit");

		System.out.print("Enter Choice: ");
		char inputButton = scanner.next().charAt(0);

		 balance = switchAtm(inputButton, balance);

		if(inputButton == 'E')
		{
        break;
		}
	}
		
		
		
		scanner.close();
	
	}
}



