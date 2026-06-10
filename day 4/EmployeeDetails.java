/* Write a program to display employee details (ID, Name, Salary) provided through command-line arguments, 
ensuring adherence to Java naming conventions. 
*/

class EmployeeDetails
{
	public void detailsPrint(int id, String name, double salary)
	{
		System.out.println("Employee Id::"+id);
		System.out.println("Employee Name::"+name);
		System.out.println("Employee Salary::"+salary);
		
	}
	
	public static void main(String args[])
	{	
		// checking input is taken or not
		if(args.length != 3)
		{
			System.out.println("Please provide a valid Input.");
			return;
		}
		
		//Taking input from command-line
		String employeeIdStr = args[0];
		String employeeName = args[1];
		String employeeSalaryStr = args[2];
		
		// conventing string to int and double 	
		int employeeId = Integer.parseInt(employeeIdStr);
		//String employeeName = nameStr;
		double employeeSalary = Double.parseDouble(employeeSalaryStr);
		
		//fecthing from method 
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.detailsPrint(employeeId, employeeName, employeeSalary);
		
		
		
	}
}