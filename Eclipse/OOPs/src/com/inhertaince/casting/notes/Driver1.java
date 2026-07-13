package com.inhertaince.casting.notes;


class Employee {

	void doSomething() {
		System.out.println("Employee.doSomething()");
	}

}

class Manager extends Employee {
	
	
	void doSomething() {
		System.out.println("Manager.doSomething()");
	}

}



public class Driver1 {

	public static void main(String[] args) {
		
		
		Employee e = new Manager(); // -> this is upcasting its happens automatic 
//		e.doSomething();
		
//		Manager m = (Manager) new Employee(); // its will give run time error i.e  ClassCastException
//		m.doSomething(); 
		
		// for doing downcast i just need to do 
		Manager m = (Manager) e;
		m.doSomething(); 
		
		

	}

}
