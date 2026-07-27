package com.fuctionalinterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PracticePredicate {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Provide Number: ");
		int num = scanner.nextInt();
//		Predicate<Integer> isEven = num1 -> num1 % 2 == 0;
//		
//		if(isEven.test(num)) {
//			System.out.println(num+" is even!");
//		}
//		else {
//			System.out.println(num+" is odd!");
//		}
		
//		Predicate<Integer> isEven = num1 -> num1% 2 == 0;
//		Predicate<Integer> isDivisible5 = num1 -> num1% 5 == 0;
//		Predicate<Integer> filter = isEven.and(isDivisible5);
//		if(filter.test(num)) {
//			System.out.println(num+ " is even and divisble by 5!");
//		}
		
		Predicate<Integer> isEven = num1 -> num1 % 2 == 0;
		Predicate<Integer> isNotEven = isEven.negate();
		if(isNotEven.test(num)) {
			System.out.println(num+" is not even!");
		}
		
		scanner.close();
		
	}

}
