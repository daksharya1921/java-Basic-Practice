//package com.listexample.hashsetexample;
//
//import java.util.HashSet;
//
//public class Driver {
//	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return 599;
//	}
//	
//	
//	
//	public static void main(String []args) {
//		
//		HashSet<String> hs = new HashSet<String>();
//		hs.add("Daksh");
//		hs.add("Arya");
//		hs.add("Masood");
//		hs.add("Sandeep");
//		
//	}
//
//}

package com.listexample.hashsetexample;

import java.util.HashSet;

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // 🔹 Force all objects into the same bucket
    @Override
    public int hashCode() {
        return 1; // same hash for everyone
    }

    // 🔹 Define equality based on name and id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return id == other.id && name.equals(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}

public class Driver {
    public static void main(String[] args) {
//        HashSet<Employee> hs = new HashSet<>();
//
//        hs.add(new Employee("Daksh", 101));
//        hs.add(new Employee("Arya", 102));
//        hs.add(new Employee("Masood", 103));
//        
//        hs.add(new Employee("Sandeep", 104)); hs.add(new Employee("Mohit", 105));
//        hs.add(new Employee("Rohit", 106)); hs.add(new Employee("Sumit", 107));
//        hs.add(new Employee("Rahul", 108)); hs.add(new Employee("Raj", 109));
//        
//        
//        // duplicate
//
//        System.out.println(hs);
    	
    	//ArrayIndexOutOfBoundsException
    	
    	String s = "Kodewala";
    	System.out.println(s.indexOf("ode"));
    }
}
