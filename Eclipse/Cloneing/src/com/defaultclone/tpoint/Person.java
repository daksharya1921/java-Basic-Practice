package com.defaultclone.tpoint;

public class Person implements Cloneable{
	
	private Car car;
	private String name;
	
	
	public Person(String _name, Car _car) {
		this.setName(_name);
		this.setCar(_car);
		
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}