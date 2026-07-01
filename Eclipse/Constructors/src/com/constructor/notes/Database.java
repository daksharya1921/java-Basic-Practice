package com.constructor.notes;


class ReaderDB extends Database{
	
	ReaderDB(){
		
	}
	
	{
		System.out.println("ReaderDB.enclosing_method()");
	}
}



public class Database {
	
	String dbName , user, pwd;
	 static int count = 0;
	
	public Database() {
		
		this("sqlDB","Admin123", "Test@123");
		
		
	}
	
	
	protected Database(String _dbName,String _user,String _pwd) {
		
		super();
		this.dbName = _dbName;
		this.user = _user;
		this.pwd = _pwd;
				
		
	}
	
	{
		count++;
		
	}
	
	
	
	

	public static void main(String[] args) {
	
		Database db = new Database();
		
		ReaderDB rd = new ReaderDB();
		System.out.println("Number of Object is Created Inside Database class by calling another class i.e ReaderDB : "+Database.count);
		

	}

}
