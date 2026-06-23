package com.irctc.booking;

public class Passenger {

    private String name;
    private int age;
    private String status;

    public Passenger(String name, int age, String status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    @Override
    public String toString() {

        return "Passenger [name=" + name +
               ", age=" + age +
               ", status=" + status + "]";
    }
}