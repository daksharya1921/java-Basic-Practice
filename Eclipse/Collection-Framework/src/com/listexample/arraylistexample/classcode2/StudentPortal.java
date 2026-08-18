package com.listexample.arraylistexample.classcode2;

import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.FileNotFoundException;

public class StudentPortal {

	public static void main(String[] args) {

		ArrayList<Student> studentDetails = new ArrayList<Student>();
		studentDetails.add(new Student("Raj", new Address("BTM 1st", "banglore INDIA")));
		studentDetails.add(new Student("Raza", new Address("BTM 1st", "banglore INDIA")));
		studentDetails.add(new Student("Arya", new Address("BTM 1st", "banglore INDIA")));
		studentDetails.add(new Student("Singh", new Address("Tollangue", "Kolkata INDIA")));
		studentDetails.add(new Student("Suman", new Address("Park Circus", "kolkata INDIA")));

		ObjectOutputStream oos = null;
		try {
			 oos = new ObjectOutputStream(new FileOutputStream("StudentDetails.iem"));
		} catch (FileNotFoundException exceptionObject) {
			System.out.println(exceptionObject.getMessage());
		} catch (IOException exceptionObject) {
			System.out.println(exceptionObject.getMessage());
		}
		
		try {
		 oos.writeObject(studentDetails);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

		finally {
			try {
				System.out.println("Serliztion DOne");
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
