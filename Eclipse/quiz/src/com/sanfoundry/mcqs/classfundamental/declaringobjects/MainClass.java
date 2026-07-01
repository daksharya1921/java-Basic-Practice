package com.sanfoundry.mcqs.classfundamental.declaringobjects;

public class MainClass {
	
	public static void main(String args[])
    {
        int x = 9;
        if (x == 9) 
        { 
            int x = 8; //Duplicate local variable won't 
            System.out.println(x);
            
			/*
			 * you cannot declare a local variable with the exact same name as another local
			 * variable in an enclosing scope. Since int x = 9; is already declared in the
			 * main method scope, trying to redeclare int x = 8; inside the nested if block
			 * causes a variable shadowing conflict, resulting in a compile-time error
			 * ("Variable 'x' is already defined in the scope").
			 * 
			 */
        }
    }
}
