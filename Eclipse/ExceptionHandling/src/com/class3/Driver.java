package com.class3;

public class Driver 
{

	public static void main(String[] args)
	{
		int[] arr = {1,3,5};
		try
		{
			System.out.println(100/2);
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arthmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds exception");
		}
		
		System.out.println();
	}
}
