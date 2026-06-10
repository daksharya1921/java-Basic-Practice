class Calculator
{
	public static void main(String args[])
	{
		if(args.length != 3)
		{
			System.out.println("Please give a valid Input.");
			return;
		}
		
		String firstNumberStr = args[0];
		String secondNumberStr = args[1];
		String arithmeticOperator = args[2];
		
		System.out.println("-------------------------------------------------------------");
		int firstNumber = Integer.parseInt(firstNumberStr);
		int secondNumber = Integer.parseInt(secondNumberStr);
		
		System.out.println("First Number::"+firstNumber);
		System.out.println("Second Number::"+secondNumber);
		System.out.println("Arithmetic operation::"+arithmeticOperator);
		
		if(arithmeticOperator.equals("+"))
		{
			int sum = firstNumber + secondNumber;
			System.out.println("Sum Of two Numbers::"+sum);
		}
		else if(arithmeticOperator.equals("-"))
		{
			int sub = firstNumber + secondNumber;
			System.out.println("Subtract Of two Numbers::"+sub);
		}
		else if(arithmeticOperator.equals("*"))
		{
			int multiplication = firstNumber * secondNumber;
			System.out.println("Multiplication Of two Numbers::"+multiplication);
		}
		else if(arithmeticOperator.equals("/"))
		{
			int divide = firstNumber / secondNumber;
			System.out.println("Divide Of two Numbers::"+divide);
		}
		else 
		{
			System.out.println("Please provide the valid Arithmetic Operator.");
			
		}
		System.out.println("-------------------------------------------------------------");
		
	}
}