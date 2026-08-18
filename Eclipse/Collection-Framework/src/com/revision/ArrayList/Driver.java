package com.revision.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
 * Iterable -> Collection -> List -> ArrayList
 * Set-> set use duplicates value plus in order ways
 * Ordered means the way u inserted u will get out in that mannner
 * Duplicates means how many times u insert value u will get same value in the that many times
 * 1. ArrayList ->  its indexBased 
 * -> Internal woirking its indexed based and continuous(Contiguous) Memory locations
 * ->insert in the middle shift Right
 * -> delete in the middle shift light
 * -> Random access / Random Read is O(1) -> Constant time cuz its index based and continuous memory so its will go directly to specific index
 * -> Best suited for random access
 * -> Default capcity of arrayList is 10 its increase by 50% its will copy all data and move to next postion when shifiting go always adding add() -> O(1) -> at last is always not O(1) its can different
 * 
 * TIME COMPLEXITY-> means how the amount of work grows as input size grows.
 * 
 * 
 * ? Why continuous memory affects resizing  -> ArrayList needs a continuous block of memory of the current spaces are scattered it cannot combine two chunks its need to move to the more suited elements where it can store the data it will copy everything from here and save it there 
 */

public class Driver {

	public static void main(String[] args) {
		
		CityService cs = new CityService();
		
		List cityNames = cs.addCity();
		
		
		System.out.println(cityNames);

	}
}
