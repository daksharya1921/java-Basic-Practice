public class PrimitiveDataType
{
	public static void main(String[] args)
	{
		//declaring boolean variable;
		
		String isValidstr = args[0];
		
		boolean isValid = Boolean.parseBoolean(isValidstr);
		
		//boolean isValid = true;
		System.out.println("Values:"+isValid);
		
		//System.out.println("Boolean Size: "+Boolean.Size + "bits");
		
		//  or boolean, Java does not specify a fixed size in the language specification
		
	}
}