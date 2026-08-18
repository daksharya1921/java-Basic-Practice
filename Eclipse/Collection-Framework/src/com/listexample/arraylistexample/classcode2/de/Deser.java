package com.listexample.arraylistexample.classcode2.de;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.listexample.arraylistexample.classcode2.Student;
//import com.listexample.arraylistexample.classcode2.StudentPortal;

import java.io.IOException;
import java.io.FileNotFoundException;

public class Deser {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException 
	{
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("StudentDetails.iem"));
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		Student sp =(Student) ois.readObject();
		
		System.out.println(sp.getFullName() +" "+sp.getAddress());
		
		ois.close();
		
	}

}
