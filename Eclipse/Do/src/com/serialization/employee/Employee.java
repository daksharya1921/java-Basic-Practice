package com.serialization.employee;

import java.io.Serializable;

public class Employee implements Serializable
{
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empId;
	private String name;
	private String empRole;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getEmpRole() {
		return empRole;
	}
	
	

}
