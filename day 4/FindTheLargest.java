//Write a program to find the largest of three numbers passed through command-line arguments

class FindTheLargest
{	
	
	public void largestNumOutOfThree(int a, int b, int c)
	{
		if(a>b && b>c)
		{
			System.out.println("Largest Number is ::"+a);
		}
		else if(b>a && a>c)
		{
			System.out.println("Largest Number is ::"+b);
		}
		else 
		{
			System.out.println("Largest Number is ::"+c);
		}
	}
	
	public static void main(String args[])
	{
		if(args.length != 3)
		{
			System.out.println("Please provide a valid input");
			return;
		}
		
		String firstNumStr = args[0];
		String secondNumStr = args[1];
		String thirdNumStr = args[2];
		
		
		
		int firstNum = Integer.parseInt(firstNumStr);
		int secondNum = Integer.parseInt(secondNumStr);
		int thirdNum = Integer.parseInt(thirdNumStr);
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("First Number ::"+firstNum);
		System.out.println("Second Number  ::"+secondNum);
		System.out.println("Third Number  ::"+thirdNum);
		
		System.out.println("-------------------------------------------------------------");
		
		FindTheLargest findTheLargest = new FindTheLargest();
		findTheLargest.largestNumOutOfThree(firstNum, secondNum, thirdNum);
		
		
	}
}