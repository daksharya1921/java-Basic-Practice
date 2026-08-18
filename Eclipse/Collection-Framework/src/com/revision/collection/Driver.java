package com.revision.collection;

/*
 * Need of the Collection -> 
 *  collection was add in java 1.2 before that we had vector and some other but they have other name for same fuction like for vector add was diifernt and like array
 *  they where was static array which was pre fixed at compile time so if we need we cant use and so on so in java 2 they introduced collection which extends to iterable
 *  so like this Iterable -> collection -> list, Set -> [arrayList,LinkedList] , [HashSet,LinkedHashSet,TreeSet] and so On
 *  ArrayList is a Resizable , Array based list
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Daksh");
		names.add("Daiwik");
		System.out.println(names.get(1));
		
		List<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(9);
		
		for(Integer num : numbers) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		Set<Boolean> isTrue = new HashSet<Boolean>();
		isTrue.add(true);
		isTrue.add(false);
		isTrue.add(true);
		
		System.out.println(isTrue);
	}

}
