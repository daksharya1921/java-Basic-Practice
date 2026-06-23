package com.notes;

public class StarPrintUsingForLoop {

	private void starPrint(int number) {
		
		for(int i = 0; i<number; i++) {
			for(int j = 0; j<= i; j++) {
				System.out.print(" X ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		StarPrintUsingForLoop s = new StarPrintUsingForLoop();
		
		s.starPrint(7);
	}

}
