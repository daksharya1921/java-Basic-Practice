package com.deepcopy.serialization;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DeepCopyDeSerialization {
	
	public static void main(String[] args) throws IOException {
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		Person p = oos;
		oos.writeObject(p); 
		System.out.println(p.getName()+" "+p.getAddress());
	}

}
