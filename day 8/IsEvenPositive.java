class IsEvenPositive
{
	public static void main(String[] args)
	{
		String numberStr = args[0];
		
		int number = Integer.parseInt(numberStr);
		
		if(number >= 0 && (number%2 == 0))
		{
			System.out.println("Number "+number+" is even and postive");
		}
		else
		{
			System.out.println("Number is either  !even or !postive:"+number);
		}
	}

}