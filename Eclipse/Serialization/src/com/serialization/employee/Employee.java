package com.serialization.employee;

import java.io.Serializable;

public class Employee implements Serializable
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String employeeRole;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	
	
	
}
