package com.listexample.arraylistexample.tpoint;


import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DeSerlize {
	
	public static void main(String[] args) throws FileNotFoundException ,IOException, ClassNotFoundException
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ArrayList.hello"));
		
		ArrayList data = (ArrayList) ois.readObject();
		
		System.out.println(data);
		ois.close();
	}

}
