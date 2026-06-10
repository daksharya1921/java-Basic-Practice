// Write a program to accept Student ID, Name, and Marks through command-line arguments and display them using meaningful variable and method names.

class StudentDetails
{
	public void detailsPrint(int id, String name, double mark)
	{	System.out.println("-------------------------------------------------------------");
		System.out.println("Student Id::"+id);
		System.out.println("Name Of the student::"+name);
		System.out.println("Marks::"+mark);
		System.out.println("-------------------------------------------------------------");
		
	}

	public static void main(String args[])
	{
		if(args.length != 3)
		{
			System.out.println("Please provide a valid Input");
			return;
		}
		
		String studentIdStr = args[0];
		String studentName = args[1];
		String studentMarksStr = args[2];
		
		int studentId = Integer.parseInt(studentIdStr);
		double studentMarks = Double.parseDouble(studentMarksStr);
		
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.detailsPrint(studentId, studentName, studentMarks);
		
		
	}
}