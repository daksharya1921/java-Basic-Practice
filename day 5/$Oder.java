class $Order
{
	public static void main(String[] args)
	{
		String orderIdStr = args[0];
		String productNameStr = args[1];
		
		int orderId = Integer.parseInt(orderIdStr);
		
		System.out.println("Order ID::"+orderId);
		System.out.println("Product name of order::"+productNameStr);
		
	}

}