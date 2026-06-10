class Student
{	
	static int totalStudents= 100;
	
	String name;
	String rollNo;
	
	public static void main(String[] args)
	{
		Student student = new Student();
		
		student.name = args[0];
		student.rollNo = args[1];
		
		System.out.println("Name:"+student.name);
		System.out.println("Roll No:"+student.rollNo);
		student.displayCollage();
		
		
	}
	
	
	public void displayCollage()
	{
		String collageName="IEM,Kolkata";
		System.out.println("Collage Name::"+collageName);
	}
	
}