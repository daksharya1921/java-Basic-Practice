package com.myntra;

import com.myntra.clothing.men.MensProduct;
import com.myntra.clothing.women.WomensClothing;

public class MainApp {
	
	public static void main(String[] args) {
		MensProduct mp = new MensProduct();
		
		System.out.println(mp.productName);
		
		WomensClothing wc = new WomensClothing();
		System.out.println(wc.productName);
		
	}

}
