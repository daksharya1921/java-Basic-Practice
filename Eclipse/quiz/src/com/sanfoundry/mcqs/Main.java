package com.sanfoundry.mcqs;

import java.util.Scanner;

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int digit = 0;
		int p = 0;
		while(x > 0){
		    
		     digit = x % 10;
		     p = x% 100;
		        x=0;
		     
		     
		    
		}
		if(p != digit){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
		
		s.close();

	}
}
