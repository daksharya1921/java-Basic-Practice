package com.polymorphism.classnotes.bookingsystem;

public class BookingUser {

	public static void main(String[] args) {
		
		TicketBooking booking;
		
		booking = new TicketBooking();
		
		booking.bookTicket("Daiwik Arya");
		booking.bookTicket("John", 54678-87);
		booking.bookTicket("Rahul raj", "Rahul@raj");

	}

}
