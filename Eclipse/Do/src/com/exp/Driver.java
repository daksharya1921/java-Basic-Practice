package com.exp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.serialization.employee.Employee;

public class Driver {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream dj = new ObjectInputStream(new FileInputStream("C:\\Batch\\Kodewala 1 june batch Practice\\Eclipse\\Do\\src\\emp.serr"));
		
		Employee e = (Employee) dj.readObject();
		
		//System.out.println(new java.io.File(".").getAbsolutePath());
		
		System.out.println(e.getEmpId()+" "+e.getEmpRole()+" "+e.getName());
		
		dj.close();
	}
}

