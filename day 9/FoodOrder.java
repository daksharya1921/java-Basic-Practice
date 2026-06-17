/* Question 1: Food Order Status

Create a class FoodOrder.

Requirements:

Create a method prepareOrder(String foodName).
Create another method isReady().
isReady() should return true.
prepareOrder() should call isReady() and return "Order Ready".
*/

class FoodOrder
{
	public static void main(String[] args)
	{
		String foodName = args[0];
		System.out.println(FoodOrder.prepareOrder(foodName));
	
		
	}
	
	static String prepareOrder(String foodName)
	{	
		System.out.println("Food Name::"+foodName);
		System.out.print("Order Ready::");
		System.out.println(FoodOrder.isReady());
		return 	"Thank You :) ";
	}
	
	static boolean isReady(){
		boolean orderReady = true;
		return orderReady;
	}
}