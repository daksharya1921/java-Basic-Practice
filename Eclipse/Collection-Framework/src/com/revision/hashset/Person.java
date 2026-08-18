package com.revision.hashset;

public class Person {

}

class Main
{
	
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Person p2 = new Person();
		
		int hash = p1.hashCode();
		int bucket = hash & (16-1);
		System.out.println("Bucket: "+bucket);
		
		System.out.println("p1 HashCode: "+p1.hashCode());
		System.out.println("p2 hashCode: "+p2.hashCode());
		
	}
}