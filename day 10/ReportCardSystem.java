/* 1. Student Report Card System ⭐

Concepts Used

Scanner
Variables
int, double, char, String
Methods
if-else


Enter Student Name
Enter Marks of 3 Subjects

Calculate:
- Total
- Average
- Grade

Print Report Card

*/


import java.util.Scanner;

class ReportCardSystem
{
	char gradeReport(double avg){
		if (avg >= 90)	return 'A';
			else if(avg >= 75)	return 'B';
			
			else if(avg >= 60) return 'C';
			
			else  return 'D';
	}
	
	double totalAverage(double sum){
		double average = (sum/3.0);
		
	}
	
	double sumTotal(double markScience, double markMaths, double markEnglish){
		double sum = (markScience+markMaths+markEnglish);
		
			
	}
	

	String printStudentName(String studentName){
		
		String name = studentName+ ":)";
		
		return name;
	}
	
	void printReportCard(String studentName, double markScience, double markMaths, double markEnglish){
			
			System.out.println("Report Card  ");
			
			System.out.println("-----------------------------------------------------------------------------");
			
			String name = printStudentName(studentName);
			System.out.println("Full Name of Student ::"+name);
			
			double sum = sumTotal(markScience, markMaths, markEnglish);
			System.out.println("Total Sum is ::"+sum);
			
			double average = totalAverage(sum);
			System.out.println("Total Average is ::"+average);
			
			char grade = gradeReport(average);
			System.out.println("Grade is ::"+grade);
			
			System.out.println("-----------------------------------------------------------------------------");
			
	}
	
	

	public static void main(String[] args){
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student Name:");
		String studentName = scanner.nextline();
		
		System.out.println("Enter Marks of 3 Subjects:");
		double markScience = scanner.nextInt();
		double markEnglish = scanner.nextInt();
		double markMaths = scanner.nextInt();
		
		printReportCard(studentName, markScience, markMaths,markEnglish);
		
		
		scanner.close();
	}
}
