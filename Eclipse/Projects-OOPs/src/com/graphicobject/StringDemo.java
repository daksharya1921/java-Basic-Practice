package com.graphicobject;

public class StringDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        
//        String fs;
//        fs = String.format("The value of the float " +
//                           "variable is %f, while " +
//                           "the value of the " + 
//                           "integer variable is %d, " +
//                           " and the string is %s",
//                           floatVar, intVar, stringVar);
//        System.out.println(fs);
        
        // put original string in an 
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = 
                palindrome.charAt(i);
        } 
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                tempCharArray[len - 1 - j];
        }
        
        String reversePalindrome =
            new String(charArray);
        System.out.println(reversePalindrome);
    }
    
    
}
