/*   Question 1: Movie Ticket Booking

Create a class MovieTicket.

Inputs (from command line)
Customer Name
Ticket Type (Regular or VIP)
Number of Tickets
Ticket Price
Rules
If ticket type is VIP and total amount is greater than or equal to 3000, give 15% discount.
Else if total amount is greater than or equal to 1500 or vip memeber will get , give 5% discount.
Otherwise, no discount.
Output

Print:

Customer Name
Total Amount
Discount Applied
Final Amount 

*/

class MovieTicket
{	
	static int gst = 18;
	public static void main(String[] args)
	{
		String customerName = args[0];
		String ticketType = args[1];
		String numberOfTicket = args[2];
		String ticketPriceStr = args[3];
		
		double ticketPrice = Double.parseDouble(ticketPriceStr);
		
		double totalTicketPrice = ticketPrice+(ticketPrice/100*gst);
		
		if( totalTicketPrice >= 3000 && ticketType.equals("VIP"))
		{
			int discount = 15;
			
			double totalTicketPriceAfterDiscount = (totalTicketPrice - (totalTicketPrice/100*discount));
			
			System.out.println("Hello "+customerName+" !!"+"\nNumber Of Ticket::"+numberOfTicket+"\nTicket Price::"+ticketPrice+"\nAfter GST ticket Price::"+totalTicketPrice+"\nFinal Amount::"+totalTicketPriceAfterDiscount);
		}
		else if(totalTicketPrice >= 1500 || ticketType.equals("VIP") )
		{
			int discount = 5;
			double totalTicketPriceAfterDiscount = (totalTicketPrice - (totalTicketPrice/100*discount));
			
			System.out.println("Hello "+customerName+" !!"+"\nNumber Of Ticket::"+numberOfTicket+"\nTicket Price::"+ticketPrice+"\nAfter GST ticket Price::"+totalTicketPrice+"\nFinal Amount::"+totalTicketPriceAfterDiscount);
		}
		
		else 
		{
			System.out.println("Hello "+customerName+" !!"+"\nNumber Of Ticket::"+numberOfTicket+"\nTicket Price::"+ticketPrice+"\nAfter GST ticket Price::"+totalTicketPrice+"\nFinal Amount::"+totalTicketPrice);
		}
	}
}