package shape;

public class Circle{

	/*private  static double area(double radius){
		
		app\Main.java:9: error: area(double) has private access in Circle
                System.out.println("Cirle Area::"+Circle.area(5.0));
                                                        ^
1 error
		
		*/
		/*
	  static double area(double radius){
		  
		  app\Main.java:9: error: area(double) is not public in Circle; cannot be accessed from outside package
                System.out.println("Cirle Area::"+Circle.area(5.0));
                                                        ^
1 error
		  
		  */
		  /*
		  
		  protected  static double area(double radius){
			  
			  app\Main.java:9: error: area(double) has protected access in Circle
                System.out.println("Cirle Area::"+Circle.area(5.0));
                                                        ^
1 error
			  
			  */
			  
		public  static double area(double radius){	  
		return Math.PI * radius * radius; 
	
	}
}