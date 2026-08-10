package com.listexample.arraylistexample.tpoint;

import java.util.ArrayList;

public class Addmission {
	
	public static void main(String[] args)
	{
		ArrayList<Student> studentList = new ArrayList<>(50);
		
		studentList.add(new Student( "Sonoo",3, 23));  
		studentList.add(new Student("Ravi",7, 21));  
		studentList.add(new Student("Hanumat",49, 25));  
		
		for(Student student : studentList) {
			int roll = student.getRollNo();
			if(roll< 4)
			  System.out.println(student.getName() + " " + student.getRollNo() + " " + student.getAge());  
		}
	}
}
