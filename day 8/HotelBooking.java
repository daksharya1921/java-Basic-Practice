/*
	Question 3: Hotel Room Booking

Create a class HotelBooking.

Inputs
Customer Name
Room Type (AC or NonAC)
Number of Days
Room Rent Per Day
Rules
Calculate total rent.
If room type is AC and total rent ≥ 10000, give 20% discount.
Else if total rent ≥ 5000, give 10% discount.
Otherwise add ₹500 service charge.
Output

Print:

Customer Name
Total Rent
Discount/Service Charge
Final Amount

*/

class HotelBooking
{	
	static int gst = 18;
	public static void main(String[] args)
	{
		String customerName = args[0];
		String roomTypes = args[1];
		String numberOfDays = args[2];
		String roomRentStr = args[3];
		
		
		double roomRent = Double.parseDouble(roomRentStr);
		
		double totalAmount = (roomRent)+(roomRent/100*gst);
		
		if(roomRent >= 10000 )
		{
			int discount = 20;
			double discountPrice = (totalAmount/100*discount);
			double finalAmount = (totalAmount- discountPrice);
			
			System.out.println("Hello "+customerName+" !!"+"\nTotal Rent::"+roomRent+"\nTotal Rent After Gst::"+totalAmount+"\nDiscount::"+discountPrice+"\nTotal Amount::"+finalAmount);
		}
		else if(roomRent >= 5000)
		{
			int discount = 10;
			double discountPrice = (totalAmount/100*discount);
			double finalAmount = (totalAmount- discountPrice);
			
			System.out.println("Hello "+customerName+" !!"+"\nTotal Rent::"+roomRent+"\nTotal Rent After Gst::"+totalAmount+"\nDiscount::"+discountPrice+"\nTotal Amount::"+finalAmount);
		}
		
		else 
		{
			
			int serviceCharge = 500;
			//double discountPrice = (totalAmount/100*discount);
			double finalAmount = (totalAmount + serviceCharge);
			
			System.out.println("Hello "+customerName+" !!"+"\nTotal Rent::"+roomRent+"\nTotal Rent After Gst::"+totalAmount+"\nService Charge::"+serviceCharge+"\nTotal Amount::"+finalAmount);
		}
	
	}
}