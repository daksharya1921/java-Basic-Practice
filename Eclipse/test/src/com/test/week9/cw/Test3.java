package com.test.week9.cw;

class A {

    static String s = init();

    String value = "A";

    static String init() {
        System.out.print("S1 ");
        return "JAVA";
    }

    {
        System.out.print("I1 ");
    }

    A() {

        System.out.print(get().length() + " ");

    }

    String get() {

        try {

            System.out.print("AG ");

            return value;

        } finally {

            System.out.print("AF ");

        }

    }

}

class B extends A {

    static {

        System.out.print("S2 ");

    }

    String value = "Backend";

    {

        System.out.print("I2 ");

    }

    B() {

        System.out.print(value + " ");

    }

    @Override
    String get() {

        try {

            System.out.print("BG ");

            return value.toUpperCase();

        } finally {

            System.out.print("BF ");

        }

    }

}

public class Test3 {

    public static void main(String[] args) {

        try {

            A a = new B();

            System.out.print(a.get());

        }

        catch(Exception e) {

            System.out.print(
                    e.getClass().getSimpleName()
            );

        }

    }

}