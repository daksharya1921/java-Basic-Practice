class DivideTwoNumber
{
	public static void main(String[] args){
		
		String firstNumberStr =  args[0];
		String secondNumberStr = args[1];
		
		int firstNumber = Integer.parseInt(firstNumberStr);
		int secondNumber = Integer.parseInt(secondNumberStr);
		
		System.out.println("First Number "+firstNumber);
		System.out.println("Second Number "+secondNumber);
		
		double divide = DivideTwoNumber.dividing(firstNumber,secondNumber);
		System.out.println("Divide is "+divide);
	}
	
	static double dividing(int firstNumber, int secondNumber){
		double divide = firstNumber % secondNumber;
		
		return divide;
	} 
}