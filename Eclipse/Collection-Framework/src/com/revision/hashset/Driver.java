package com.revision.hashset;

import java.util.Set;
import java.util.HashSet;

/*
 * ? Set -> Uniqueness(no duplicates) but no guarantee order - the key trade off from the set 
 *  
 */

public class Driver 
{

	public static void main(String[] args)
	{
		Set<String>cities = new HashSet<String>();
		
		
		
		cities.add("Banglore"); // -> internally works as citites.put(element,value)
		cities.add("Jaipur");
		cities.add("Mysore");
		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Chennai"); // -> Duplicates will be igonerd
		
		for(String city: cities) {
			System.out.print(city+" ");
		}
		
		//output order doesn't match insertion order-
		//it refelects bucket order in each city's hasCode
		//"Chennai" appears only once - duplicates was silently ignored
		//HashCode internally implements Map which internally each buckets hava Singly LInkedList
		// HashCode internally capcity is 16 and if its get 75% full it will automatically increase size to 100%
		
		// HashSet.add() calls map.put() internally
	}
}
