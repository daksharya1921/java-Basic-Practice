//BANK APPLICATION
//implement methods like deposit(int amount) and checkBalance() for basic operations



class BankApplication
{
	static void  checkBalance(int balance)
	{
		System.out.println("Balance::"+balance);
	}
	
	static int deposit(int balance,int deposit){
	return (balance+deposit);
	}
	
	
	static void process(int balance , int deposit){
		
		System.out.println("Process method");
		
		checkBalance(balance);
		
		System.out.println("total Amount after deposit"+(deposit(balance,deposit)));
		
		
	}

	public static void main(String[] args){
		
		String balanceStr = args[0];
		String depositStr = args[1];
		
		int balance = Integer.parseInt(balanceStr);
		int deposit = Integer.parseInt(depositStr);
		
		process(balance,deposit);
		
	}
}