
import java.util.Scanner;

class EmployeeDetails
{
	static int companyCode = 342;
	
	String name;
	int age;
	String deparment;
	
	public static void main(String[] args)
	{	
		System.out.println("main method start here ");
		System.out.println("-------------------------------------------------------------");
	
	
		Scanner scanner = new Scanner(System.in);
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		
		System.out.println("Name of the Employee::");
		employeeDetails.name = scanner.nextLine();
		
		System.out.println(" Employee age::");
		employeeDetails.age = scanner.nextInt();
		
		System.out.println(" Employee Deparment::");
		employeeDetails.deparment = scanner.next();
		
		employeeDetails.printDetails();
		
		scanner.close();
		System.out.println("-------------------------------------------------------------");
		System.out.println("main method End here ");
	}
	
	void printDetails()
	{
		System.out.println("PrintDetails method start here ");
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("Name of the Employee::"+name);
		System.out.println(" Employee age::"+age);
		System.out.println(" Employee Deparment::"+deparment);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("PrintDetails method End here ");
	}
}