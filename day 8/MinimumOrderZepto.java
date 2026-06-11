class MinimumOrderZepto
{
	public static void main(String[] args)
	{
		String orderPriceStr = args[0];
		
		int orderPrice = Integer.parseInt(orderPriceStr);
		
		System.out.println("Delivery Free :"+(orderPrice >= 450));
	}
}