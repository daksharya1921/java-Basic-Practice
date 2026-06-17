// Simple calculator 
// Write a method to perform basic operations like addition , Subtraction,Multiplication,And division
//use an object to call these methods from the main program.
import java.util.Scanner;

class SimpleCalculator
{
	static Scanner scanner = new Scanner(System.in);
	
	static int addition(int firstNumber, int secondNumber){
	
		return firstNumber+secondNumber;
	}
	
	static int subtraction(int firstNumber, int secondNumber){
	
		return firstNumber-secondNumber;
	}
	
	static int multiplication(int firstNumber, int secondNumber){
		
		return firstNumber*secondNumber;
	}
	
	static int division(int firstNumber, int secondNumber){
	
		return firstNumber/secondNumber;
	}
	
	static void calculation(){
		
		System.out.println("First Number::");
		int firstNumber = scanner.nextInt();
		System.out.println("Second Number::");
		int secondNumber = scanner.nextInt();
		
		System.out.println("Sum::"+ addition( firstNumber,  secondNumber));
		System.out.println("Subtraction::"+subtraction( firstNumber, secondNumber));
		System.out.println("Multiplication::"+multiplication(firstNumber,  secondNumber));
		System.out.println("Division::"+division(firstNumber,  secondNumber));
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Simple Calculator");
		System.out.println("--------------------------------------------------------------");
		SimpleCalculator.calculation();
		System.out.println("--------------------------------------------------------------");
	
	}
	
//scanner.close();
}