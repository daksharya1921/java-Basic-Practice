package com.test.week9.pw;

class Parent {

    String name = "Parent";

    static {
        System.out.print("S1 ");
    }

    {
        System.out.print("I1 ");
    }

    Parent() {

        System.out.print(getValue() + " ");

    }

    Number getValue() {

        try {

            System.out.print("PT ");

            return name.length();

        }
        finally {

            System.out.print("PF ");

        }

    }

}

class Child extends Parent {

    String name = "Child";

    static {

        System.out.print("S2 ");

    }

    {

        System.out.print("I2 ");

    }

    Child() {

        System.out.print(name + " ");

    }

    @Override
    Integer getValue() {

        try {

            System.out.print("CT ");

            return name.length();

        }
        finally {

            System.out.print("CF ");

        }

    }

}

public class Test2 {

    public static void main(String[] args) {

        Parent p = new Child();

    }

}
