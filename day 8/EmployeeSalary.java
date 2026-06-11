/*Create a class EmployeeSalary.

Inputs
Employee Name
Employee Type (Permanent or Contract)
Basic Salary
Rules
If employee type is Permanent and salary ≥ 50000:
Bonus = 20% of salary
Else if salary ≥ 30000:
Bonus = 10% of salary
Otherwise:
Bonus = 5% of salary
Output

Print:

Employee Name
Basic Salary
Bonus
Net Salary
*/

class EmployeeSalary
{
	public static void main(String[] args)
	{
		String employeeName = args[0];
		String employeeType = args[1];
		String employeeSalaryStr = args[2];
		
		int salary = Integer.parseInt(employeeSalaryStr);
		
		if(salary >= 15000 && employeeType.equals("Permanent"))
		{
			int bonusPercent = 20;
			int bonus = (salary/100*bonusPercent);
			
			int netSalary = salary+ bonus;
			
			System.out.println("Employee Name::"+employeeName+"\nBasic Salary"+salary+"\nBonus ::"+bonus+"\nNet Salary::"+netSalary);
		}
		else if(salary >= 30000 )
		{
			int bonusPercent = 10;
			int bonus = (salary/100*bonusPercent);
			
			int netSalary = salary+ bonus;
			
			System.out.println("Employee Name::"+employeeName+"\nBasic Salary"+salary+"\nBonus ::"+bonus+"\nNet Salary::"+netSalary);
		}
		else
		{
			int bonusPercent = 5;
			int bonus = (salary/100*bonusPercent);
			
			int netSalary = salary+ bonus;
			
			System.out.println("Employee Name::"+employeeName+"\nBasic Salary"+salary+"\nBonus ::"+bonus+"\nNet Salary::"+netSalary);
		}
	}
}
