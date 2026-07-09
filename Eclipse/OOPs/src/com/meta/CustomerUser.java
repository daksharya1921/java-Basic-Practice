package com.meta;

public class CustomerUser extends User{
	
	String customerName;

	public CustomerUser(String _name, String _email,String _customerName) {
		super(_name, _email);
		this.customerName = _customerName;
	}
	
	@Override
	 void showUserDetails() {
			
			System.out.println("Customer Name: "+customerName+"\nEmail: "+email);
			
		}
	
	public static void main(String[] args) {
		CustomerUser cu = new CustomerUser("Rsm" , "dfghj@dfg.com", "raj");
		cu.showUserDetails();
	}
}
