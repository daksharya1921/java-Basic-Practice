public class Test1 {
	//-------Error on compile time its showing 
	/*   Debug1.java:1: error: class Test1 is public, should be declared in a file named Test1.java
			public class Test1 {
				   ^
			1 error   */
			
			//---->> if public class there should have same name of file as class name as here class name is Test1 so the file name 
			//----->> should also be the same also not Debug1.
			
			//----??? why for public class need to have same file name ? and for normal class we don't need same file name as class name
			/* Answer:->  public class must have the same filename because the compiler and JVM use this strict mapping to locate and load classes reliably. 
							Non‑public classes don’t need this rule since they aren’t exposed outside their package
							1. Compiler consistency:
											When you compile Test1.java, the compiler generates Test1.class. 
											If another file imports Test1, the compiler knows exactly which source file to look for.
							
							2. Classpath alignment:
											Java’s classpath system expects a one‑to‑one mapping between a public class and its filename.
											This makes it easy for tools, IDEs, and build systems to locate the correct file.
							
							3. Readability & maintainability:
											Developers can instantly find the definition of a public class by looking for a file with the same name. 
											This is crucial in large projects with thousands of files.
											
							4.Public API clarity:
											A public class is part of the package’s external interface.
											Enforcing filename consistency ensures that external code can always locate it predictably
			*/

    public static void main(String args[]) {
        System.out.println("Hello Java");
    }
}