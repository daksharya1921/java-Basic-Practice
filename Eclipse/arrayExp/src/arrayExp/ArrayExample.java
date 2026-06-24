package arrayExp;

public class ArrayExample {

	public static void main(String[] args) {
		
		int number[];
		
		number = new int[5];
		
		number[0] =13;
		number[1] =54;
		number[2] =65;
		number[3] =89;
		number[4] =23;
		
		for(int index=0; index < number.length; index++) {
			
			System.out.println(number[index]);
			
			if(number[index] > 50) {
				System.out.println("Hello!");
			}
		}

	}

}
