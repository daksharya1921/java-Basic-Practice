class ValidateAgeDL
{
	public static void main(String[] args)
	{
		String ageStr = args[0];
		
		int age = Integer.parseInt(ageStr);
		
		if(age >= 18 && age <= 70)
		{
			System.out.println("Valid for the dl");
		}
		else{
			System.out.println("!Valid for the dl");
		}
	}
}