package com.kodewala;

public class Break {

	public static void main(String[] args) {
		
		String products[] = {"apple17","samsung","lg","nokia","tata","apple17","samsung34","apple16"};
		
		for(int index = 0; index<products.length; index++) {
			
			if(products[index] == "apple17") {
				System.out.println("I found my Expeceted Output: "+products[index]);
				break;
			}
		}
	}

}
