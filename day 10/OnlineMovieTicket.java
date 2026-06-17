/*Question 1: Online Movie Ticket Booking (String Return Type)
Requirements
bookTicket(String movieName, int seats)
Call generateTicketId()
Call checkSeatAvailability()
Call paymentStatus()
Call sendConfirmation()
Return final booking message as String.
*/

class OnlineMovieTicket
{
	
	static String sendConfirmation(){
	
		return "Confirmation of Ticket";
	
	}
	
	static String paymentStatus()
	{
		return "Payment is Done";
	}
	
	
	static String checkSeatAvailability(){
		
		return "Yes Seat is Available";
	}
	
	
	
	static String generateTicketId()
	{	 	
		
		checkSeatAvailability();
		System.out.println(checkSeatAvailability());
		
		paymentStatus();
		System.out.println(paymentStatus());
		
		sendConfirmation();
		System.out.println(sendConfirmation());
		
		
		
		return "Ticket is Booked";
		
		
		
	}
	
	
	
	
	
	public static void main(String args[])
	{
		String  generateTicket = generateTicketId();
		System.out.println("------------------------------------------------------------------------------");
		
		System.out.println(generateTicket);
		
		System.out.println("------------------------------------------------------------------------------");
		
	}

}