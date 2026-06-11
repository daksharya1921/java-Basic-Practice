class SpecificRange
{
	public static void main(String[] args)
	{
		String numberStr = args[0];
		
		int number = Integer.parseInt(numberStr);
		
		if(number >= 10 && number <= 50)
		{
			System.out.println("Number "+number+" is Between 10 to 50");
			
		}
		else 
		{
			System.out.println("Number "+number+" is !Between 10 to 50");
		}
	}
}