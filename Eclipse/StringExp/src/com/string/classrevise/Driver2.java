package com.string.classrevise;

public class Driver2 {

	public static void main(String[] args) {
		
		String input = "   Java is a versatile programming language widely used in software development. "
			    + "It supports object oriented principles and provides strong memory management. "
			    + "Developers rely on Java for building web applications, mobile apps, and enterprise solutions. "
			    + "Its portability across platforms makes it a reliable choice. "
			    + "With libraries and frameworks, Java simplifies complex tasks. "
			    + "Learning Java helps students understand core concepts like classes, objects, inheritance, and polymorphism. "
			    + "Debugging and problem solving in Java sharpen logical thinking. "
			    + "From small projects to large systems, Java remains relevant. "
			    + "Practice and consistency are key to mastering Java programming effectively.";

		String inputTrim = input.trim();
		
		System.out.println("After Trim:"+inputTrim);
		
		String[] inputArray = inputTrim.split("\\.");
		for(int index = 0; index < inputArray.length; index++) {
			String currentIndex = inputArray[index];
			System.out.println("After Split:"+currentIndex);
		}
		

	}

}
