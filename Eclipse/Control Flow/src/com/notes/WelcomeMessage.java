package com.notes;

public class WelcomeMessage {

	private void welcomeMessage(int noOfTimes) {
		
		for(int index = 0 ; index < noOfTimes; index++) {
		
		System.out.println("Hello \nWelcome to Kodewala");
	}
	}
	
	public static void main(String[] args) {
		
		int number = 6;
		
		WelcomeMessage wm = new WelcomeMessage();
		
		wm.welcomeMessage(number);
		
	}

}
