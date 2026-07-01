package com.constructor.debug;



public class A {

    static int x = initializeX();

    int a = initializeA();

    static {
        System.out.println("A Static Block 1");
    }

    {
        System.out.println("A Instance Block 1");
    }

    static {
        System.out.println("A Static Block 2");
    }

    {
        System.out.println("A Instance Block 2");
    }

    public A() {
        this(100);
        System.out.println("A Default Constructor");
    }

    public A(int value) {
        System.out.println("A Parameter Constructor : " + value);
    }

    static int initializeX() {
        System.out.println("A Static Variable");
        return 10;
    }

    int initializeA() {
        System.out.println("A Instance Variable");
        return 20;
    }

    static void staticMethod() {
        System.out.println("A Static Method");
    }

    void instanceMethod() {
        System.out.println("A Instance Method");
    }
}