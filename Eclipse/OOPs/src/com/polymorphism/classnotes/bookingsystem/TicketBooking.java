package com.polymorphism.classnotes.bookingsystem;

public class TicketBooking {

	void bookTicket(String name) {
		System.out.println("Ticket is Booked by Name: "+name);
	}
	
	void bookTicket(String name, long phoneNumber) {
		System.out.println("Ticket is Booked by Name: "+name+ " And Phone Number : "+phoneNumber);
	}
	
	void bookTicket(String name , String email) {
		System.out.println("Ticket is Booked by Name: "+name+ " And email: "+email);
	}
	
}
