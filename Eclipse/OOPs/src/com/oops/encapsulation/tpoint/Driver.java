package com.oops.encapsulation.tpoint;

public class Driver {

	public static void main(String[] args) {
//		Student student = new Student();
//		
//		student.setName("Daksh Arya");
//		
//		System.out.println("student.getName(): "+student.getName());
//		
		
		//College college = new College();
		
		//college.setCollege("Daksh"); -> here we are not setting to change college name only we can get college name but we cannot  not fetch college name   
		// i.e read only class
		
		//System.out.println(college.getCollege()); // thats only write only like if 
		// class has getter method than thats class is Read only class
		// where as the class which has setter method only thats class is called Write only class

		
		Account acc = new Account();

		acc.setAcc_no(7560504000L);
		acc.setName("Daiwik Arya");
		acc.setEmail("daiwikarya@helptech.com");
		acc.setAmount(500000d);
		// getting values through getter methods
		System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());

	}

}
