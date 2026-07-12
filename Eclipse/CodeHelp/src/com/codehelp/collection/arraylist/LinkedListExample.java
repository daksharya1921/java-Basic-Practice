package com.codehelp.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll1 = new LinkedList<>();
		
//		List<Integer> ll2  = new LinkedList<>();
//		
//		Collection<Integer> ll3 = new LinkedList<>();
		
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
		ll1.add(50);
		
		System.out.println("Linked List: "+ll1);
		
		System.out.println(ll1);
		System.out.println(ll1.size());
		ll1.remove(0);
		
		System.out.println(ll1);
		
		ll1.remove(ll1.size()-1);
		
		System.out.println("Printing List:"+ll1);
		ll1.add(21);
		ll1.add(-12);
		
		Collections.sort(ll1);
		
		System.out.println("Sorted in Asending Order: "+ll1);
		
		Collections.sort(ll1, Collections.reverseOrder());
		System.out.println("Descending Sorrted List:"+ll1);
		
		
//		//-------------------------clone()----------------------------------
		LinkedList<Integer> newList = (LinkedList<Integer>)ll1.clone();
		System.out.println("newList: "+newList);
		
		
		//-------------------------ensureCapcity()----------------------------------
		LinkedList<Integer> marks = new LinkedList<>();
	//	marks.ensureCapacity(100);
		System.out.println("marks.size(:)"+marks.size());
		
		//-------------------------isEmpty()----------------------------------
		System.out.println("newList.isEmpty(): "+newList.isEmpty());
		System.out.println("marks.isEmpty() :"+marks.isEmpty());
		
		//-------------------------indexOf()----------------------------------
		System.out.println(newList.indexOf(20));
		

	}

}
