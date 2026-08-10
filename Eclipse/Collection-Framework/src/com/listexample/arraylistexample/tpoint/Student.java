package com.listexample.arraylistexample.tpoint;

public class Student {
	
	private String name;
	public Student(String name, int rollNo, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	private int rollNo,age;
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public int getAge() {
		return age;
	}

}
