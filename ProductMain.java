package com.blc.elc;

public class ProductMain {

	public static void main(String[] args) {
		Product prod=new Product();
		prod.setProductDetails("Laptop",501,7500.0);
		String result= prod.getProductDetails();
		System.out.println(result);

	}

}
