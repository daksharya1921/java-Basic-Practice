package com.oops.encapsulation.tpoint;

public class College {
	
	private String college = "IEM Kolkata";
	
	//------------------------------------------------------------------------------------------
	// Read-Only Class
//	public String getCollege() {
//		return college;
//	}
	
	
	//----------------------------------------------------------------------------------------------
	// Write-Only Class	
	public void setCollege(String college) {
		this.college = college;
	}

}
