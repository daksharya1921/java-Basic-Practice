package com.aggregation.hasa.tpoint;

class Employee {
	int id;
	String name;

	Driver driver; // -> this is A Aggregation
					// -> i.e HAS-A relationship
}

//  Inheritance should be used only if the relationship is-a is maintained throughout the lifetime 
//  of the objects involved; otherwise, aggregation is the best choice
public class AggregationExample {

}
