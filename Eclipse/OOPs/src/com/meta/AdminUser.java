package com.meta;

public class AdminUser extends User{
	
	public AdminUser(String _name, String _email) {
		super(_name, _email);
		
	}
	
	public static void main(String[] args) {
		AdminUser au = new AdminUser("Daiwik Arya","daiwik@meta.com");
		
		au.showUserDetails();
	}

}
