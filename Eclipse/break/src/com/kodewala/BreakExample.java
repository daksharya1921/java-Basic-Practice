package com.kodewala;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<= 10; i++) {
			if(i == 5) {
				break; //Exit the loop
			}
			System.out.println("i :"+i);
		}
		System.out.println("Loop is Ended!");
	}

}
