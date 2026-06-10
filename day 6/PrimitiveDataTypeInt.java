class PrimitiveDataTypeInt
{
	public static void main(String[] args )
	{
		//declaring in variable
		
		String penStr = args[0];
		String pencilStr = args[1];
		
		int pen = Integer.parseInt(penStr);
		int pencil = Integer.parseInt(pencilStr);
		
		int total = pen+pencil;
		System.out.println(" Total Items::"+total);
		
		System.out.println("Int Size: "+Integer.SIZE+" bits");
		System.out.println("Int Range: "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
	}
}