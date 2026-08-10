package com.listexample.arraylistexample.tpoint;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.io.IOException;
import java.io.FileNotFoundException;

public class ArrayListSerlize {

	public static void main(String[] args) throws IOException,FileNotFoundException 
	{
		
		ArrayList<String> empName = new ArrayList<>(50);
		empName.add("Masood Raza");
		empName.add("Daksh Arya");
		empName.add("Daiwik Arya");
		empName.add("Aman Pandey");
		empName.add("Nishi pandey");
		empName.add("Bibhuti Bhardwaj");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ArrayList.hello"));
		oos.writeObject(empName);
		
		oos.close();

	}

}
