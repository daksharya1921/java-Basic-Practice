/* Question 2: Electricity Bill

Create a class ElectricityBill.

Inputs
Consumer Name
Consumer Type (Domestic or Commercial)
Units Consumed
Rules
Unit rate = ₹8
If consumer type is Commercial and units are greater than 500, add 10% surcharge.
Else if units are greater than 300, add 5% surcharge.
Otherwise no surcharge.
Output

Print:

Consumer Name
Units Consumed
Bill Amount
Surcharge
Total Bill
*/

class ElectricityBill
{	
	static int unitRate = 8;
	
	public static void main(String[] args)
	{
		String customerName = args[0];
		String customerType = args[1];
		String unitsStr = args[2];
		
		int units = Integer.parseInt(unitsStr);
		int totalPrice = units*unitRate;
		if(units >= 300 && customerType.equals("Commercial"))
		{
			int surcharge = 10;
			int finalAmount = (totalPrice+(totalPrice/100*surcharge));
			
			System.out.println("Consumer Name ::"+customerName+"\nUnits Consumed::"+units+"\nSurcharge::"+surcharge+"\nTotal Bill::"+finalAmount);
		}
		else if(units >= 300)
		{
			int surcharge = 5;
			
			int finalAmount = (totalPrice+(totalPrice/100*surcharge));
			
			System.out.println("Consumer Name ::"+customerName+"\nUnits Consumed::"+units+"\nSurcharge::"+surcharge+"\nTotal Bill::"+finalAmount);
		}
		else
		{
			int surcharge = 0;
			
			System.out.println("Consumer Name ::"+customerName+"\nUnits Consumed::"+units+"\nSurcharge::"+surcharge+"\nTotal Bill::"+totalPrice);
		}
	}

}