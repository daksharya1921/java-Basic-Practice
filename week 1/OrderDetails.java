class OrderDetails
{
	public static void main(String args[])
	{
		if(args.length != 3)
		{
			System.out.println("Please Provide a vaild Input.");
			return;
		}
		
		String orderName = args[0];
		String orderQtyStr = args[1];
		String orderAddress = args[2];
		
		int orderQty = Integer.parseInt(orderQtyStr);
		
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("Your Order is "+orderName);
		System.out.println("Your Order qty is "+orderQty);
		System.out.println("Your Order Address is "+orderAddress);
		
		System.out.println("-------------------------------------------------------------");
		
		
		
	}

}