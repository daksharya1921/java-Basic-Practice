package com.Deserlization.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.serialization.employee.Employee;











public class Driver {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.serr"));
		
		//Object obj = ois.readObject();
		
		Employee e = (Employee) ois.readObject();
		
		System.out.println(e.getId() + " "+e.getEmployeeRole()+" "+e.getName());
		
		ois.close();
		
	}

}
