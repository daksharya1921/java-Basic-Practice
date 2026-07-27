package com.fuctionalinterface;

import java.util.Scanner;
import java.util.function.Consumer;

public class PracticeConsumer {
	
	public static void main(String[] args) {
//		Consumer<Integer> inverter = num -> System.out.println(-num);
//		inverter.accept(7);
//		inverter.accept(-8);
		
		Consumer<Integer> printNum = num -> System.out.print("Number: "+num);
		Consumer<Integer> invert = num -> System.out.print(", Inverted: "+(-num));
		Consumer<Integer> doubleNum = num -> System.out.println(", Double,"+num*2);
		Consumer<Integer> result = printNum.andThen(invert).andThen(doubleNum);
 		
		result.accept(10);
		
		
	}

}
