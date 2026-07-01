package com.constructor.debug;



public class B extends A {

    static int y = initializeY();

    int b = initializeB();

    static {
        System.out.println("B Static Block 1");
    }

    {
        System.out.println("B Instance Block 1");
    }

    static {
        System.out.println("B Static Block 2");
    }

    {
        System.out.println("B Instance Block 2");
    }

    public B() {
        this("Java");
        System.out.println("B Default Constructor");
    }

    public B(String name) {
        System.out.println("B Parameter Constructor : " + name);
    }

    static int initializeY() {
        System.out.println("B Static Variable");
        return 30;
    }

    int initializeB() {
        System.out.println("B Instance Variable");
        return 40;
    }

    static void staticMethod() {
        System.out.println("B Static Method");
    }

    void instanceMethod() {
        System.out.println("B Instance Method");
    }
}
