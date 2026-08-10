package com.defaultclone.tpoint;

public class ABC {
	
	int x = 30;

}

class Driver{
	
	public static void main(String[] args) {
		ABC obj1 = new ABC();
		
		ABC obj2 = obj1;
		
		obj2.x = 7;
		
		System.out.println("The value of x is "+obj1.x);
	}
}