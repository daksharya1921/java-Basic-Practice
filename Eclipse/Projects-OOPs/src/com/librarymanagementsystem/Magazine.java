package com.librarymanagementsystem;

public class Magazine extends Item{

	private String magazineAvailability;
	
	@Override
	public void getId() {
		System.out.println();
		
	}

	@Override
	public void getDetails() {
		
		
	}

	public String checkOut() {
		return magazineAvailability;
	}

	public void returnItem(String magazineAvailability) {
		this.magazineAvailability = magazineAvailability;
	}
	
}
