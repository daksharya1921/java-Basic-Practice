class HelloWorld
{
	/*
	
	----------Invalid Java main() method signature-------------
	
	public void main(String[] args) // its won't compile also its will give error in compile time itself
	
	->Error:javac HelloWorld.java
	HelloWorld.java:38: error: ';' expected
        public void main(String[] args)
                                       ^
1 error
	
	static void main(String[] args)-> it will complie but its will give error on runtime error
		->Error: Main method not found in class HelloWorld, please define the main method as:
		public static void main(String[] args)
		or a JavaFX application class must extend javafx.application.Application


	  
	public void static main(String[] args)   -> its wont complie 
	->Error:HelloWorld.java:44: error: <identifier> expected
			public void static main(String[] args)
                   ^
		HelloWorld.java:44: error: '(' expected
			public void static main(String[] args)
                    ^
		HelloWorld.java:44: error: invalid method declaration; return type required
			public void static main(String[] args)
                           ^
		HelloWorld.java:44: error: ';' expected
				public void static main(String[] args)
                                              ^
		4 errors
	
	abstract public static void main(String[] args) -> its won't compile
		HelloWorld.java:58: error: ';' expected
        abstract public static void main(String[] args)
                                                       ^
	1 error 
	
	*/
	
	/*
	---------Valid Java main() method signature ----------
	 // static public void main(String args[]) -> its working fine  its compiling and runing too
	//  public static void main(String[] args)  -> its also working fine its compiling and running too 
	// public static void main(String []args)  -> itss also Working fine its compiling and running too
	
	public static void main(String[] args)  
	public static void main(String []args)  
	public static void main(String args[])  
	public static void main(String... args)  
	static public void main(String[] args)  
	public static final void main(String[] args)  
	final public static void main(String[] args)  
	final strictfp public static void main(String[] args)  
	
	*/
	public static void main(String args[])  
	
	 
	
	{
		System.out.println("  Hello    World !! ");
	}

}