class PrimitiveDataTypeLong
{
	public static void main(String[] args)
	{
		
		String amountStr = args[0];
		
		long amount = Long.parseLong(amountStr);
		
		// Declaring long variable 
		//long amount = 4989283402853l;
		System.out.println("Amount::"+amount);
		
		System.out.println("Long size: "+Long.SIZE+" bits");
		System.out.println("Long Range: "+Long.MIN_VALUE+ " to "+ Long.MAX_VALUE);
		
	}
}