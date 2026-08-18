package com.listexample.hashingexample;

import java.util.Set;
import java.util.HashSet;

public class Driver {

	public static void main(String[] args) 
	{
		Set<String>product = new HashSet<String>();
		
		boolean p = product.isEmpty();
		System.out.println(p);
		
		product.add("Daksh");
//		product.add("Daiwik");
//		product.add("Raj");
//		product.add("Arya");
//		product.add("Ramesh");
//		product.add("Masood");
//		product.add("Jiya");
//		product.add("Suman");
//		product.add("Parveen");
//		product.add("Naveen");
//		product.add("Name");
//		product.add("Surname");
		
		// till here loadFactor : .75 
		// till here threshold  :12 
		// default initial capacity (16)
		// if threshold reached its 75% limit its increase by 100% and its do rehashing of whole hashSet like
		// its so costly its will do rehashing of whole hashSet 
		// thats why we need to predefine the intially to avoid rehashing 
		
		// Hash Collision its identify the same buckets any thing like same hashcode or same bucket some how
		
		//product.add("Patel");
		
		product.remove("Daksh");
		
		System.out.println();
		
	//	System.out.println(product.contains("Raj"));
		
		
	}
}
