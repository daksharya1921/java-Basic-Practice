package com.string.classrevise;

public class Driver {

	public static void main(String[] args) {

		String name = "Daksh Arya";
		
		System.out.println("name.charAt(6):"+name.charAt(6)); // its just print whats in name at Character at 06 
		
		
		//Converting String to char we use like toCharArray
		char input[] = name.toCharArray();
		for(int index = 0; index< input.length; index++) {
			char currentInput = input[index];
			System.out.println("Current Input: "+currentInput);
			// if(currentInput == )
		}
		
		for(int index = 0; index < 10; index++) {
			name = name.concat(" " + index); // its will create 10 object like Daksh Arya 0 
			System.out.println(name); // String not modify its self always Create more and more object in this loop object will Create 10 time Cuz loops will WOrks on 10 times 
			
		}
		
	}

}
