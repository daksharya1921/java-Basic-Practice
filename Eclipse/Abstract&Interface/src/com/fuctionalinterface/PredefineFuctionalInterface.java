package com.fuctionalinterface;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefineFuctionalInterface {

	public static void main(String[] args) {
		
		//Predicate Functional Interface its return true/false its use for comparing number and all
		Predicate<Integer> isGreater = (number) -> number >= 100;
		System.out.println(isGreater.test(5));
		
		//Supplier Functional Interface in this we only supply thing its doesn't return anything
		
		Supplier<String> input = () -> "Hello";
		System.out.println(input.get());
		
		Supplier<Integer> otp = () -> 10000+new Random().nextInt(70000);
		System.out.println("OTP: "+otp.get());
		
		// Consumer Fuctional Interface its only get value doesn't return anything
		Consumer<String> email = (emailTo) -> System.out.println("Heloo from India is my mail "+emailTo);
		email.accept("daiwikarya132@googlie.com");
		
		//Function <inputType,outputType> 
		// its will take as any datatype and its will return as u defined data type
		Function<Integer, Boolean> output = (inputInt) -> 
		{
			boolean result = inputInt != 100;
			return result;
		};
		
		System.out.println(output.apply(200));
		
	}

}
