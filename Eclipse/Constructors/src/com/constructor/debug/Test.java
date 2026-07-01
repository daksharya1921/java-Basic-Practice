package com.constructor.debug;



public class Test {

    static {
        System.out.println("Test Static Block");
    }

    {
        System.out.println("Test Instance Block");
    }

    public static void main(String[] args) {

        System.out.println("Main Started");

        B.staticMethod();

        System.out.println("----------------");

        B obj1 = new B();

        System.out.println("----------------");

        B obj2 = new B("Spring");

        System.out.println("----------------");

        obj1.instanceMethod();

        System.out.println("----------------");

        A ref = new B();

        System.out.println("----------------");

        ref.instanceMethod();

        System.out.println("----------------");

        System.out.println(A.x);
        System.out.println(B.y);

        System.out.println("Main End");
    }
}
