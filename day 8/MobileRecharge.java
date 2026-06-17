/*
Bonus Question 6: Mobile Recharge

Create a class MobileRecharge.

Inputs
Customer Name
Plan Type (Prepaid or Postpaid)
Recharge Amount
Rules
If plan type is Prepaid and recharge amount ≥ 1000:
Cashback = 10%
Else if recharge amount ≥ 500:
Cashback = 5%
Otherwise:
No cashback
Output

Print:

Customer Name
Recharge Amount
Cashback
Effective Cost
*/

class MobileRecharge
{
	public static void main(String[] args)
	{
		String customerName = args[0], planType = args[1], rechargeAmountStr = args[2];
		
		double rechargeAmount = Double.parseDouble(rechargeAmountStr);
		
		if(planType.equals("Prepaid") && rechargeAmount >=1000){
			int cashbackPercantage = 10;
			double cashback = (rechargeAmount/100*cashbackPercantage);
			
			double effectiveCost = (rechargeAmount - cashback);
			
			System.out.println("Hello "+customerName+" !!" + "\nRecharge Amount::"+rechargeAmount+"\nCashback::"+cashback+"\nEffective Price::"+effectiveCost);
		}
		else if( rechargeAmount >=1000){
			int cashbackPercantage = 5;
			double cashback = (rechargeAmount/100*cashbackPercantage);
			
			double effectiveCost = (rechargeAmount - cashback);
			
			System.out.println("Hello "+customerName+" !!"+"\nRecharge Amount::"+rechargeAmount+"\nCashback::"+cashback+"\nEffective Price::"+effectiveCost);
		}
		else {
			int cashbackPercantage = 0;
			double cashback = (rechargeAmount/100*cashbackPercantage);
			
			double effectiveCost = (rechargeAmount - cashback);
			
			System.out.println("Hello "+customerName+" !!"+"\nRecharge Amount::"+rechargeAmount+"\nCashback::"+cashback+"\nEffective Price::"+effectiveCost);
		}
		
	}
}