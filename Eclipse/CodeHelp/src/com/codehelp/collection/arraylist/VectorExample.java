package com.codehelp.collection.arraylist;


import java.util.Collections;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// List or  Collection -> interface
		
				//ArrayList -> Concrete class
				Vector<Integer> list = new Vector<>();
				list.add(10);
				list.add(20);
				list.add(30);
				list.add(40);
				list.add(50);
				
				System.out.println(list);
				System.out.println(list.size());
				list.remove(0);
				
				System.out.println(list);
				
				list.remove(list.size()-1);
				
				System.out.println(list);
				
				System.out.println("------------------------------------------------");
				
				Vector<Integer> list2 = new Vector<>();
				list2.add(50);
				System.out.println(list2);
				
				list2.addAll(list);
				System.out.println(list2);
				
				System.out.println("Size of list2 :"+list2.size());
				System.out.println("using .clear to remove from list2");
				list2.clear();
				
				System.out.println("Size of list2 :"+list2.size());
//				
				
				
				Vector<Integer> list3 = new Vector<>();
		     	list3.add(11);
		     	list3.add(12);
		     	list3.add(13);
		     	list3.add(14);
		     	System.out.println("Before: list3.set(0,77):::; "+list3);
		     	
		     	list3.set(0,77);
		     	System.out.println(list3);
		     	
		     	 Object[] arr = list3.toArray();
		     	 for(Object it: arr) {
		     		 System.out.println(it);
		     	 }
		     	 
		     	 System.out.println(list3.contains(77));
		     	
		     	
				System.out.println("Printing List:"+list);
				list.add(21);
				list.add(-12);
				
				Collections.sort(list);
				
				System.out.println("Sorted in Asending Order: "+list);
				
				Collections.sort(list, Collections.reverseOrder());
				System.out.println("Descending Sorrted List:"+list);
				
				
//				//-------------------------clone()----------------------------------
				Vector<Integer> newList = (Vector<Integer>)list.clone();
				System.out.println("newList: "+newList);
				
				
				//-------------------------ensureCapcity()----------------------------------
				Vector<Integer> marks = new Vector<>();
				marks.ensureCapacity(100);
				System.out.println("marks.size(:)"+marks.size());
				
				//-------------------------isEmpty()----------------------------------
				System.out.println("newList.isEmpty(): "+newList.isEmpty());
				System.out.println("marks.isEmpty() :"+marks.isEmpty());
				
				//-------------------------indexOf()----------------------------------
				System.out.println(newList.indexOf(20));
	}
}
