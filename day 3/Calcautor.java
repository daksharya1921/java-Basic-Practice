class Calc
{
	public static void main (String[] args)
	{
		String input1 = args[0];
		String input2 = args[1];
		String input3 = args[2];
		
		//System.out.println("DEBUG VERSION");
	//	for(int i = 0; i < args.length; i++)
	//	{
	//		System.out.println("args[" + i + "] = " + args[i]);
	//	}
		
		int firstNum = Integer.parseInt(input1);
		int secNum = Integer.parseInt(input2);
		
		System.out.println("First Number::"+firstNum);
		System.out.println("Second Number::"+secNum);
		
		System.out.println("Operator = [" + input3 + "]");
		
		
		if(input3.equals("+"))
		{
			int sum = firstNum + secNum;
			System.out.println("Sum of two Numbers::"+sum);
		}
		else if(input3.equals("-"))
		{
			int diff = firstNum - secNum;
			System.out.println("Difference of two num::"+diff);
		}
		else if(input3.equals("x"))
		{
			int multi = firstNum * secNum;
			System.out.println("Multipcation of two num::"+multi);
		}
		else if(input3.equals("/"))
		
		{
			int divide = firstNum / secNum;
			System.out.println("Division of two num::"+divide);
		}
		
		else 
		{
			System.out.println("Invalid Operators,use only + - * / operators");
		}
		
		//System.out.println("First Number:::"+firstNum+"  Second Number:::"+secNum+"   Sum of two Num:::"+sum);
	}
}