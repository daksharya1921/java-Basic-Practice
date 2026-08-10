package com.defaultclone;

/*
 * CLoneing there is two types of cloning the Default i.e shallow cloning and 
 * 1. Shallow Clone
 * -> just clone the Reference not the nested cloning 
 * 2. Deep Clone
 * -> nested cloning
 */

class Address{
	String line1;
	public Address(String line1) {
		this.line1 = line1;
	}
}

class Employee implements Cloneable
{
	String name;
	Address address;
	public Employee(String _name, Address _address) {
		this.name = _name;
		this.address = _address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class Cloneing {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("Bihar");
		
		Employee e1 = new Employee("Daksh Arya", address);
		
		Employee e2;
		e2 = (Employee) e1.clone();
		
		e2.address.line1 = "Karnataka";
		
		System.out.println("*************Before CLone e1*********");
		System.out.println("Before  "+e1.name+"\n"+e1.address.line1);
		
		
		
		System.out.println("*************After CLone e2 = (Employee) e1.clone()*********");
		
		System.out.println("after :->> "+e2.name+"\n"+e2.address.line1);
		
	}
	

}
