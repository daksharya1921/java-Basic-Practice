/* 
	E-Commerce Order Processing

main()
 ↓
placeOrder()
 ↓
checkStock()
 ↓
calculatePrice()
 ↓
applyDiscount()
 ↓
generateBill()

Requirements
Product Price = ₹2000
If price > ₹1000, apply 10% discount.
Generate final bill amount.
Return bill message from generateBill().

*/

class OrderProcessing
{
	public static void main(String[] args)
	{
		
		OrderProcessing.placeOrder();
		
		
		
	}
	
	static void placeOrder()
	{
		double basePrice = 2000;
		OrderProcessing.checkStock(basePrice);
	}
	
	static void checkStock(double price)
	{
		
		OrderProcessing.calculatePrice(price);
	}
	
	static void calculatePrice(double price){
	
		OrderProcessing.applyDiscount(price);
	
	}
	
	static void applyDiscount(double price){
			if(price >= 1000){
			price = (price - (price*.10));
			}
			OrderProcessing.generateBill(price);
	}
	
	static void generateBill(double finalPrice){
		
		String message="Order placed Successfully! Total Amount: ₹"+finalPrice;
		System.out.println(message);
			
	}
	
	
}

