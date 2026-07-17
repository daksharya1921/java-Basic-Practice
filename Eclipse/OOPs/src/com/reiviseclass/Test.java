package com.reiviseclass;

// valid 

// A. public class Circle implements Shape { private int radius; } -> is not valid
// B. public abstract class Circle extends Shape { private int radius; } -> not valid
//C. public class Circle extends Shape { private int radius; public void draw(); } -> is not valid

//D. 
public abstract class Circle implements Shape { private int radius; public void draw(); }

 class Test {

}
