package com.program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Driver1 {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("MyFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Counter newCounter = (Counter) ois.readObject();
		System.out.println(newCounter.getCount());
		ois.close();
		
	}

}
