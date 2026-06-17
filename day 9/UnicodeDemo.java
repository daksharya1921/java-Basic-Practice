
//Program to convert UTF-8 to Unicode

public class UnicodeDemo   
{  
   public static void main(String ar[]) throws Exception   
   {  
      String str1 = "Unicode Sytem\u00A9";  
      byte[] charset = str1.getBytes("UTF-8");  
      String newstr = new String(charset, "UTF-8");  
      System.out.println(newstr);  
   }  
}  

/* 
	*In the above code, a Class UnicodeDemo is created.
	*At the start, a Unicode String str1 is converted into a UTF-8 form using the getBytes() method. 
	*After that, the byte array is again converted into Unicode and the value of newstr is displayed on the console
	
*/