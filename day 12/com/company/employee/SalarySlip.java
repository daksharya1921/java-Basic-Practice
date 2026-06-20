
package com.company.employee;

public class SalarySlip
{
    public static void main(String[] args)
    {
        double basicSalary = Double.parseDouble(args[0]);
        
		double salary = Employee.calculateSalary(basicSalary);
        // Print final salary
		
		System.out.println("Salary::"+salary);
}
}