class CompareTwoNum
{
	public static void main(String args[])
	{
		String firstNumStr = args[0];
		String secNumStr = args[1];
		
		int firstNum = Integer.parseInt(firstNumStr);
		int secNum = Integer.parseInt(secNumStr);
		
		if(firstNum>secNum)
		{
			System.out.println("First num is larger:"+firstNum);
			
		}
		else
		{
			System.out.println("Second num is larger:"+secNum);
		}
	}
}