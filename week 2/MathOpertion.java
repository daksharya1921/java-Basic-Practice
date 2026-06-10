class MathOpertion
{
	public static void main(String[] args)
	{
		int number1 = 10;
		int number2 = 11;
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("Maxmum number::"+Math.max(number1,number2));
		System.out.println("Minimum number::"+Math.min(number1,number2));
		
		int rootNum= 81;
		System.out.println("Root of Num"+rootNum+" is :"+Math.sqrt(rootNum));
		
		System.out.println("Number1 is "+number1+" is power of Number2:"+number2+ " is "+Math.pow(number1,number2));
		System.out.println("-------------------------------------------------------------");
		
		double guess = 4.7d;
		double ceil1 = 4.1d;
		double roof1 = 4.9d;
		
		System.out.println("4.7 round of will be "+Math.round(guess));
		System.out.println("4.1 ceiling of will be "+Math.ceil(ceil1));
		System.out.println("4.9 Floor of will be "+Math.floor(roof1));
		System.out.println("-------------------------------------------------------------");
		
		// Math.random() -- will give random value which will be between 0-1;
		System.out.println("Math random value will be : "+Math.random()*7777);
		System.out.println("Math random value will be : "+(int)(Math.random()*101));
		
		// for geting random number as int we need to cast into int 
		//int randomNum = (int)(Math.random() * 101);  
		
		
		
	}
}