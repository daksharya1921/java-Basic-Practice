class ValidForDL
{
	public static void main(String[] args)
	{
		String ageStr = args[0];
		
		int age = Integer.parseInt(ageStr);
		
		int minAge = 18 , maxAge= 60;
		
		if( age >= minAge &&  age <= maxAge)
		{
			System.out.println("Eligeable for DL");
		}
		else
		{
			System.out.println("Invalid for DL Your age is::"+age);
		}
		
	}
}