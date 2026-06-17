/* ATM Withdrawal System (int Return Type)
Logic

User enters amount.

Flow:

withdraw()
    |
    --> checkBalance()
    --> debitAmount()
    --> generateTransactionId()
    --> smsNotification()
	
	*/
	
	class AtmWithdrawalSystem
	{	
		static void smsNotification(int transtionId){
		
			System.out.println("Thank for transtion you have debited balance transtion id:"+transtionId);
		
		}
		
		static void generateTransactionId(){
			int transtionId = 70002320;
			smsNotification(transtionId);
			System.out.println("Transtion Id::"+transtionId);
		}
		
		static double debitAmount(double balance){
		
			double finalAmount = balance - 10;
			
			generateTransactionId();
			
			return finalAmount;
		
		}
		
		static void checkBalance(double balance){
			if(balance >= 10.0){
				double finalAmount =debitAmount( balance);
				System.out.println("final Amount::"+finalAmount);
				System.out.println("Completed!!");
			}
			else System.out.println("Failedd!!");
		
		}
		
		
		
		
		
		public static void main(String[] args)
		{
			String balanceStr = args[0];
			
			double balance = Double.parseDouble(balanceStr);
			
			checkBalance(balance);
		
		}
		
		
		
		
		
	
	}