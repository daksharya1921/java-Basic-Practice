class Calc
{
	public static void main(String args[])
	{
		if(args.length < 3)
		{
			System.out.println("Plase provide input that is First Number Second Number  and  Arthemtic operation ");
			return;
		}
		
		String firstNumberStr = args[0];
		String secondNumberStr = args[1];
		String arthmeticOperationStr = args[2];
		
		int firstNumber = Integer.parseInt(firstNumberStr);
		int secondNumber = Integer.parseInt(secondNumberStr);
		
		System.out.println(" First number::"+firstNumber);
		System.out.println(" Second number::"+secondNumber);
		
		System.out.println(" Arthemtic operation::"+arthmeticOperationStr);
		
		if(arthmeticOperationStr.equals("+"))
		{
			int sum = firstNumber + secondNumber;
			System.out.println(" The sum of Two number::"+sum);
		}
		else if(arthmeticOperationStr.equals("-"))
		{
			int subtract = firstNumber - secondNumber;
			System.out.println(" The sum of Two number::"+subtract);
		}
		else if(arthmeticOperationStr.equals("x"))
		{
			int mul = firstNumber * secondNumber;
			System.out.println(" The Mulipcation of Two number::"+mul);
		}
		else if(arthmeticOperationStr.equals("/"))
		{
			int divide = firstNumber / secondNumber;
			System.out.println(" The Divide of Two number::"+divide);
		}
		else if(arthmeticOperationStr.equals("%"))
		{
			int divisor = firstNumber + secondNumber;
			System.out.println(" The Divisor of Two number::"+divisor);
		}
		
		
	}
}
