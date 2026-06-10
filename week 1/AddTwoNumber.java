class AddTwoNumber
{
	public static void main(String args[])
	{
		if(args.length != 2)
		{
			System.out.println("Please Enter a valid Two number.");
			return;
			
		}
		
		String firstNumStr = args[0];
		String secondNumStr = args[1];
		
		int firstNum = Integer.parseInt(firstNumStr);
		int secondNum = Integer.parseInt(secondNumStr);
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("First Number::"+firstNum);
		System.out.println("Second Number:: ="+secondNum);
		System.out.println("--------------------------------------------------------------------------------------------");
		int sum = firstNum + secondNum;
		
		System.out.println("Sum of two Numbers::"+sum);
		
		
	
	}
}