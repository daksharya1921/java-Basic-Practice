class ValidForAddmission
{
	public static void main(String[] args)
	{
		String marksStr = args[0];
		String state = args[1];
		
		int marks = Integer.parseInt(marksStr);
		
		if(marks >= 90 || state.equals("Bihar"))
		{
			System.out.println("U are eligable");
		}
		else 
		{
			System.out.println("SORRY!!!");
		}
	}
}