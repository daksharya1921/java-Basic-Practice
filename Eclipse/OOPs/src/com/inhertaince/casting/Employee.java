package com.inhertaince.casting;




 class Employee {

	
	public void notSomething() {
		System.out.println("Employee.notSomething()");
	}
}


class Manager extends Employee{
	
	@Override
	public void notSomething() {
		System.out.println("Manager.notSomething()");
	}
}

 class Driver{
	
	public static void main(String[] args) {
//		Employee e = new Manager(); // Auto Upcasting 
//		e.notSomething();
		
//		Manager m = (Manager) new Employee(); 
//		m.notSomething();
		
		// obj = ObjectFactory.getObjects("Employee");
		
//		Manager m = (Manager)  obj;
//		m.notSomething();
		
		
		
		Object obj1 = ObjectFactory.getObjects("Employee");
		Employee e = (Employee) obj1;
		Manager m = (Manager) e;
		
		m.notSomething();
			
		
	}
}