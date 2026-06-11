/* Online Food Order

Create a class FoodOrder.

Inputs
Customer Name
Membership Type (Gold or Normal)
Order Amount
Rules
If membership is Gold and order amount ≥ 2000:
15% discount
Free delivery
Else if order amount ≥ 1000:
Free delivery
Otherwise:
Delivery charge = ₹50
Output

Print:

Customer Name
Order Amount
Discount
Delivery Charge
Final Amount
*/

class FoodOrder
{
	public static void main(String[] args)
	{
		String customerName = args[0];
		String customerMembershipType = args[1];
		String orderAmountStr = args[2];
		
		int orderAmount = Integer.parseInt(orderAmountStr);
		
		if(customerMembershipType.equals("Gold") && orderAmount >= 2000)
		{
			int discountPercentage = 15;
			int discount = (orderAmount/100*discountPercentage);
			int finalAmount = (orderAmount-discount);
			
			System.out.println("Hi "+customerName+" !!"+"\nOrder Amount::"+orderAmount+"\nDisount::"+discount+"\nDelivery Charge::0"+"\nFinal Amount::"+finalAmount);
		}
		else if( orderAmount >= 1000)
		{
			int discountPercentage = 0;
			int discount = (orderAmount/100*discountPercentage);
			int finalAmount = (orderAmount-discount);
			
			System.out.println("Hi "+customerName+" !!"+"\nOrder Amount::"+orderAmount+"\nDisount::"+discount+"\nDelivery Charge::0"+"\nFinal Amount::"+finalAmount);
		}
		else
		{
			int discountPercentage = 0;
			int discount = (orderAmount/100*discountPercentage);
			int delivery = 50;
			int finalAmount = (orderAmount-discount+delivery);
			
			System.out.println("Hi "+customerName+" !!"+"\nOrder Amount::"+orderAmount+"\nDisount::"+discount+"\nDelivery Charge::"+delivery+"\nFinal Amount::"+finalAmount);
		}
	}
}