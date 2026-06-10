import java.util.Scanner;

class School
{
	static String schoolName = "NPS";
	
	String name;
	int rollNumber;
	double marks;
	
	
	public static void main(String[] args)
	{   System.out.println("-------------------------------------------------------------");
		System.out.println("main method start here ");
		System.out.println("-------------------------------------------------------------");
		
		
		Scanner scanner = new Scanner(System.in);
		
		School school = new School();
		
		System.out.println("Please give Name of Student");
		school.name = scanner.nextLine();
		
		System.out.println("Please give Roll No of Student");
		school.rollNumber = scanner.nextInt();
		
		System.out.println("Please give Marks of Student");
		school.marks  = scanner.nextDouble();
		
		school.printDetails();
		
		scanner.close();
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("main method End here ");
		System.out.println("-------------------------------------------------------------");
	}
	
	public void printDetails()
	{	System.out.println("----------------------------------");
		System.out.println("printDetails method Start here ");
		
		System.out.println("-------------------------");
		System.out.println("School Name::"+schoolName);
		System.out.println("Student Name::"+name);
		System.out.println("Student RollNo::"+rollNumber);
		System.out.println("Marks:: "+marks);
		System.out.println("-------------------------");
		System.out.println("printDetails method End here ");
		System.out.println("--------------------------------");
		
	}
}