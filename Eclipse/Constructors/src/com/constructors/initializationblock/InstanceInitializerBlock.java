package com.constructors.initializationblock;

public class InstanceInitializerBlock {

	String name;
	
	InstanceInitializerBlock(){
	
	//this.name = _name;
//		{
//			System.out.println("InitializationBlock.InitializationBlock()");
//		}
		{
			 name = "Daksh Arya";
			
		}
		System.out.println("Helloooooo "+name);

	
}

	
//	{
//		System.out.println("InitializationBlock.enclosing_method()");
//		
//		System.out.println("Helloooooo "+name);
//		
//		
//		
//	}
	

	
	
}
