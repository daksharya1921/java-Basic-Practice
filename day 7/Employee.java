 import java.util.Scanner;
 
 class Employee
 {
	static String companyName = "TCS";
	
	String empName;
	double salary;
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Employee Name:");
		employee.empName = scanner.next();
		
		System.out.println("Employee Salary:");
		employee.salary = scanner.nextDouble();
		
		employee.displaySalaryAfterBonus();
		
		
		
		scanner.close();
	}
	
	public void displaySalaryAfterBonus()
	{	
		
		
		
		double bonus = 5000;
		
		double totalSalary = (salary + bonus); 
		
		System.out.println("Salary After bonus:"+totalSalary);
		
		
		
	}
 }