class UsingRecussion
{

	static void factorial(int number)
	{
		int fact = 1;
		if(number > 0){
			 fact = (fact*factorial(number-1));
			 number--;
			
		}
		else  return fact;
		
	}

	public static void main(String[] args){
		
		factorial(5);
	
	
	}
}