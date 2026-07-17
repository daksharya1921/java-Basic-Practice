package com.aggregation.hasa.tpoint.example.realtime;

public class Employee {
	
	String name;
	int id;
	Address address;
	
	public Employee(int _id,String _name,Address _address) {
		this.id=_id;
		this.name= _name;
		this.address =_address;
	}
	
	void display() {
		System.out.println(id+" "+name);
		System.out.println("Address: "+address.city+ ", "+address.state+", "+address.country);
		
	}

}
