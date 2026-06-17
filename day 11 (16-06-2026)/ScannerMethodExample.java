import java.util.Scanner;

public class ScannerMethodExample{

	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the age::");
		while(!scanner.hasNextInt()){
			System.out.println("Invalid Input! Please Enter a valid Integer.");
			scanner.next();
		}
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter Full Name::");
		while(!scanner.hasNext("[A-Za-z]+") || scanner.next().trim().isEmpty()){
			System.out.println("Invalid Input! Please Enter a valid Full Name.");
			scanner.next();
		}
		String fullName = scanner.nextLine();
		
		System.out.println("Enter Your favourite color::");
		String color = scanner.nextLine();
		
		System.out.println("Enter Your Weight::");
		Double weight = scanner.nextDouble();
		
		System.out.println("\n-----Collected Input------------------");
		System.out.println("Age: "+age);
		System.out.println("Full Name: "+fullName);
		System.out.println("Favourite Color: "+color);
		System.out.println("Weight: "+weight+"kg");
		
	}
}