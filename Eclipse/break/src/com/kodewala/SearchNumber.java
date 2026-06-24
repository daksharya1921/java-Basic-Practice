package com.kodewala;

public class SearchNumber {

	public static void main(String[] args) {
		
		//int number = Integer.parseInt(args[0]);
		int number = 11;
		boolean found = false;
		for(int index = 1; index <= 10; index++) {
			if(index == number) {
				System.out.println("Congrats Number FOund!!! "+index);
				found = true;
				break;
			}
			//else continue;
			}
		
	if(!found)	System.out.println("Not FOund Sorry!");
			
		}
	}


