package com.codehelp.collection.arraylist;

import java.util.Collections;
import java.util.Stack;


public class StackExample {

	public static void main(String[] args) {
		//ArrayList -> Concrete class
//		Stack<Integer> list = new Stack<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
//		
//		System.out.println(list);
//		System.out.println(list.size());
//		list.remove(0);
//		
//		System.out.println(list);
//		
//		list.remove(list.size()-1);
//		
//		System.out.println(list);	
//		
//		System.out.println("------------------------------------------------");
//		
//		Stack<Integer> list2 = new Stack<>();
//		list2.add(50);
//		System.out.println(list2);
//		
//		list2.addAll(list);
//		System.out.println(list2);
//		
//		System.out.println("Size of list2 :"+list2.size());
//		System.out.println("using .clear to remove from list2");
//		list2.clear();
//		
//		System.out.println("Size of list2 :"+list2.size());
////		
//		
//		
//		Stack<Integer> list3 = new Stack<>();
//     	list3.add(11);
//     	list3.add(12);
//     	list3.add(13);
//     	list3.add(14);
//     	System.out.println("Before: list3.set(0,77):::; "+list3);
//     	
//     	list3.set(0,77);
//     	System.out.println(list3);
//     	
//     	 Object[] arr = list3.toArray();
//     	 for(Object it: arr) {
//     		 System.out.println(it);
//     	 }
//     	 
//     	 System.out.println(list3.contains(77));
//     	
//     	
//		System.out.println("Printing List:"+list);
//		list.add(21);
//		list.add(-12);
//		
//		Collections.sort(list);
//		
//		System.out.println("Sorted in Asending Order: "+list);
//		
//		Collections.sort(list, Collections.reverseOrder());
//		System.out.println("Descending Sorrted List:"+list);
//		
//		
////		//-------------------------clone()----------------------------------
//		Stack<Integer> newList = (Stack<Integer>)list.clone();
//		System.out.println("newList: "+newList);
//		
//		
//		//-------------------------ensureCapcity()----------------------------------
//		Stack<Integer> marks = new Stack<>();
//		marks.ensureCapacity(100);
//		System.out.println("marks.size(:)"+marks.size());
//		
//		//-------------------------isEmpty()----------------------------------
//		System.out.println("newList.isEmpty(): "+newList.isEmpty());
//		System.out.println("marks.isEmpty() :"+marks.isEmpty());
//		
//		//-------------------------indexOf()----------------------------------
//		System.out.println(newList.indexOf(20));
		
		
		Stack<Integer> st = new Stack<>();
		st.push(10);
		System.out.println(st);
		st.push(12);
		System.out.println(st);
		st.push(14);
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		
		
		System.out.println(st.peek()); // -> top elements

		System.out.println(st.search(10));
		
		System.out.println(st.empty());
		
	}

}
