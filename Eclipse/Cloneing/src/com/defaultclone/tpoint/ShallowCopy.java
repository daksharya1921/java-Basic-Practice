package com.defaultclone.tpoint;

import java.util.Arrays;

public class ShallowCopy implements Cloneable
{
	
	private int[]  data;
	
	public ShallowCopy(int[] value) {
		this.data= value;
	}
	
	public void showData() {
		
		System.out.println(Arrays.toString(data));
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class Main1{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		int arr[] = {12,78};
		ShallowCopy s1 = new ShallowCopy(arr);
		
		ShallowCopy s2;
		s2 = (ShallowCopy) s1.clone();
		s1.showData();
		System.out.println();
		s2.showData();
		
		
	}
	
}
