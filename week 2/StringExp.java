class StringExp
{
	public static void main(String[] args)
	{	
		System.out.println("-------------------------------------------------------------");
		String greeting = "ji";
		String gite = "ji";
		
		System.out.println(greeting.equals(gite));
		System.out.println("-------------------------------------------------------------");
		
		String name = "Daksh Arya";
		
		System.out.println("-------------------------------------------------------------");
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		
		System.out.println("-------------------------------------------------------------");
		System.out.println(name.charAt(4));
		System.out.println(name.charAt(8));
		System.out.println(name.charAt(7));
		
		
		System.out.println("-------------------------------------------------------------");
		String lastName = "       last name        ";
		System.out.println(lastName.length());
		System.out.println("["+lastName+"]");
		System.out.println("["+lastName.trim()+"]");
		System.out.println(lastName.length());
		
		System.out.println("-------------------------------------------------------------");
		String greet = "Helooo namste kaise ho hola ";
		System.out.println(greet.indexOf("ho"));
		
		System.out.println("-------------------------------------------------------------");
		
		String firstName = "John ";
		String lstName = "Doe";
		System.out.println(firstName.concat(lstName));
		System.out.println("-------------------------------------------------------------");
		
		
		String x = "10";
		int y = 20;
        String z = x + y;
		System.out.println(z);
		System.out.println("-------------------------------------------------------------");
		
		String message = "hello \"namste\" aur sb\'s \n hello \\ nameste";
		System.out.println(message);
		System.out.println("-------------------------------------------------------------");
		
		
	
	}
}