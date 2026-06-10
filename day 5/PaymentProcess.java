class PaymentProcess
{
	public static void main(String[] args)
	{
		String paymentMethod = args[0];
		String paymentStatus = args[1];
		String paymentFor = args[2];
		
		System.out.println("Payment method::"+paymentMethod);
		System.out.println("Payment Status::"+paymentStatus);
		System.out.println("Payment for the "+paymentFor);
	}
}