package com.librarymanagementsystem;

public class Book extends Item {

	private String bookAvailability;
	
	@Override
	public void getId() {
		
		
	}

	@Override
	public void getDetails() {
		
		
	}

	public String checkOut() {
		return bookAvailability;
	}

	public void returnItem(String bookAvailability) {
		this.bookAvailability = bookAvailability;
	}
	
	

}
