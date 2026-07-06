package com.constructor.notes;

class A 
{
    int i;
}    
class B extends A 
{
    int i; // hides i in A
    B(int a, int b) 
    {
        super.i = a;
        i = b;
    }
    void print() 
    {
        System.out.println(super.i + " " + i);
    }
}    
class Inheritance_demo 
{
    public static void main(String args[])
    {
        B obj = new B(1, 2);
        obj.print();     
    }
}