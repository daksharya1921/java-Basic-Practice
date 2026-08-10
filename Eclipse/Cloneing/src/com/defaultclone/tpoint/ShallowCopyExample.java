package com.defaultclone.tpoint;



public class ShallowCopyExample {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Car c = new Car("BMW");
		Person person1 = new Person("Daksh Arya", c);
		
		Person person2;
		person2 = (Person) person1.clone();
		
		person2.setName("Parveen");
		person2.getCar().setName("Ferrai");
		
		System.out.println(person1.getName());
		System.out.println(person1.getCar().getName());
		System.out.println();
		System.out.println("After Clone");
		System.out.println();
		
		
		
		
		
		
		System.out.println(person2.getName());
		System.out.println(person2.getCar().getName());
		
	}

}
