package com.zepto;

public class User {
	
	private void printUserId(String userId) {
		System.out.println(userId);
	}
	
	private boolean isValidOtp(int otp) {
		boolean status = false;
		if(otp == 3456) {
			status = true;
		}
		return status;
	}
	
	void createUserId(String userName,String otpStr) {
		
		try {
		
		String userId = userName.substring(0,4)+"777";
		printUserId(userId);
		int otp = Integer.parseInt(otpStr);
		boolean result = isValidOtp(otp);
		System.out.println("Otp is Valid "+result);
		}
		catch(NullPointerException objectException) {
			objectException.printStackTrace();
			System.out.println("Provide a Valid Name..");
		}
		catch(NumberFormatException objectException) {
			objectException.printStackTrace();
			System.out.println("Provide a Valid Integer");
		}
		catch(RuntimeException objectException) {
			objectException.printStackTrace();
			System.out.println("Its an runtime error");
		}
		catch(Exception objectException) {
			objectException.printStackTrace();
			System.out.println("Unknown Exception....");
			
		}
		finally {
			System.out.println("Closing all the connection");
		}
		
		System.out.println("Exit from the createUserId() Method");
		
	}

}
