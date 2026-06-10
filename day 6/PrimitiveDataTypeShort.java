public class PrimitiveDataTypeShort
{
	public static void main(String[] args)
	{
		// Declaring short variable
		
		String amountStr = args[0];
		
		short amount = Short.parseShort(amountStr);
		
		//short amount = 10;
		System.out.println(" Values::"+amount);
		
		System.out.println("Short Size:"+Short.SIZE + " bytes");
		System.out.println("Short range: "+ Short.MIN_VALUE + " to "+ Short.MAX_VALUE);
	
	}

}