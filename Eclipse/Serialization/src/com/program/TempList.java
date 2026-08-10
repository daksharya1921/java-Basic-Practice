package com.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TempList {
	
	public static void main(String[] args) throws Exception {
		Counter counter = new Counter(10); 
		
		File f = new File("MyFile.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(counter);
		oos.close();
		
		
			
			
	}

}
