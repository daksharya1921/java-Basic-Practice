package com.string.revision;

public class Driver {

	public static void main(String[] args) {
		
		
		String name = "Daiwik Arya";
		
		
//		System.out.println("Each time there will be new object will Create in the String");
//		System.out.println(name.replace("Daiwik", "Daksh").length());
//		
//		for(int i = 0; i<10; i++) {
//			name =name.concat(" "+i);
//			
//			System.out.println(name);
//			
//			}
//		
//		
		String fullName = "Daksh Arya";
//		
	char[] charArray = fullName.toCharArray();
//		for(char it : charArray) {
//			if(it == ' ') {
//				continue;
//			
//			}
//			System.out.println(it );
//		}
		
          String[] stringArray = fullName.split(" " );
          for(String it : stringArray) {
        	  if(it == "Daksh") {
        		  it.replace("Daksh", "Daiwik");
        		//  it.repla
        	  }
        	  System.out.println(it);
          }
		
		
		for(char it: charArray) {
			if(it == ' ') {
				it = '#';
			}
			System.out.println(it + " ");
		}
		
		System.out.println(fullName.charAt(6));
		
		
		
		
		

	}

}
