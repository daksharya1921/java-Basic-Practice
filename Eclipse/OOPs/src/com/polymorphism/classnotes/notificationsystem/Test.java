package com.polymorphism.classnotes.notificationsystem;

class Demo {
    // Overloaded methods
    public void show(String msg) {
        System.out.println("String version: " + msg);
    }

    public void show(int num) {
        System.out.println("Integer version: " + num);
    }

    public void show(double val) {
        System.out.println("Double version: " + val);
    }
}

public class Test {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.show("Hello");   // calls show(String)
        d.show(42);        // calls show(int)
        d.show(3.14);      // calls show(double)

        // ❌ This will cause a compile-time error:
        // d.show(true);   // no show(boolean) defined
    }
}
