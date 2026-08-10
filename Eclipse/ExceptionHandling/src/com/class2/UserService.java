package com.class2;

import java.sql.Connection;
import java.sql.SQLException;

public class UserService {
	
	public String generateUserId(String userName) {
		String userId = null;
		try {
			userId = userName.substring(0, 3)+"123";
		}catch(NullPointerException exceptionObject) {
			System.out.println("UserName is not provided");
		}
		return userId;
	}
	
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			conn = openDatabaseConnection();
		} catch (Exception e) {
			System.out.println("Error occurred: "+e.getMessage());
		}
		finally {
			if(conn != null) {
				conn.close();
				System.out.println("Connection closed");
			}
		}
	}

	private static Connection openDatabaseConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
