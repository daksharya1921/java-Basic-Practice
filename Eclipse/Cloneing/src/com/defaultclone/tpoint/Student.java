package com.defaultclone.tpoint;

public class Student implements Cloneable
{
	
	int id;
	String name;
	
	public Student(int _id, String _name) {
		this.id = _id;
		this.name =_name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}


class Main{
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1  = new Student(4, "Daksh Arya");
		
		Student student2;
		student2 = (Student) student1.clone();
		System.out.println("****student1************");
		System.out.println(student1.id+"->"+student1.name);
		System.out.println();
		System.out.println("****student2************");
		System.out.println(student2.id+"->"+student2.name);
		
	}
}