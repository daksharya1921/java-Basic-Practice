package com.pattern;

public class Pyrimid {
	
	static void printPyrimid(int n) {
		
		for(int i = 0; i<n; i++) {
			
			for(int j = 0; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = Integer.parseInt(args[0]);
		
		Pyrimid.printPyrimid(number);
	}

}
