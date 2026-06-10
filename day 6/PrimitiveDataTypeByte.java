public class PrimitiveDataTypeByte
{
	public static void main(String[] args)
	{
		String amountStr = args[0];
		byte amount = Byte.parseByte(amountStr);
		// Declaring byte variables
		//byte amount = 124;
		System.out.println(" Values "+amount);
		
		System.out.println("Byte Size: "+Byte.SIZE+" bits.");
		System.out.println("Byte Range: "+Byte.MIN_VALUE +" to "+Byte.MAX_VALUE);
	}
}