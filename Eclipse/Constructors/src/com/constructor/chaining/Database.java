package com.constructor.chaining;

public class Database {
	
	String dbName, user, password;
	
	//Default constructor(calss parameterized constructor)
	 Database() {
		this("mydb","root","admin123");
	}
	 
	 //parameterized Constructor
	 Database(String _dbName, String _user, String _password){
		 
		this.dbName = _dbName;
		this.user = _user;
		this.password = _password;
		
		connect();
	 }
	 
	 void connect() {
		 System.out.println("Connecting to DB: "+ dbName +" as "+user);
	 }
	

	public static void main(String[] args) {
		
		new Database();

	}

}
