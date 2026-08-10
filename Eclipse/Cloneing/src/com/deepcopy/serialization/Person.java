package com.deepcopy.serialization;

import java.io.Serializable;

public class Person implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Address address;
	public Person(String _name,Address _address) {
		this.setName(_name);
		this.setAddress(_address);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}