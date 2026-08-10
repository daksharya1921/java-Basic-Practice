package com.deepclone;

class Address implements Cloneable {
	String line1;

	public Address(String _line1) {
		this.line1 = _line1;

	}

	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}

}

class Employee implements Cloneable {

	String name;
	Address address;

	public Employee(String _name, Address _address) {
		this.name = _name;
		this.address = _address;
	}

	public Employee clone() throws CloneNotSupportedException {
		Employee emp = (Employee) super.clone();
		emp.address = this.address.clone();
		return emp;
	}

}

public class DeepClone {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Bihar");
		Employee emp1 = new Employee("Daiwik", address);

		Employee emp2;
		emp2 = emp1.clone();

		emp2.address.line1 = "Karnataka";

		System.out.println("*************Before CLone e1*********");
		System.out.println("emp1.name+\" \"+emp1.address.line1:->  " + emp1.name + "\n" + emp1.address.line1);

		System.out.println("*************Before CLone e2 = (Employee) e1.clone()*********");

		System.out.println("emp2.name+\"\\n\"+emp2.address.line1 :->> " + emp2.name + "\n" + emp2.address.line1);

	}

}
