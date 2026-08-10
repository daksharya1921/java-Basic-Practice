package com.zepto;

public class UserConnectionDB {
	
	boolean isConnected(String value) {
		boolean status = false;
		try {
			int valueLength = value.length();
			if(valueLength > 5) {
				status = true;
			}
			return status;
		}
		catch(NullPointerException exceptionObject) {
			exceptionObject.printStackTrace();
			return status;
		}
		finally {
			return status;
		}
		//return status;
	}

}
