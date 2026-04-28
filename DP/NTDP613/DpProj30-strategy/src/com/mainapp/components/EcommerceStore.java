package com.mainapp.components;

import java.util.Arrays;
import java.util.Random;

public class EcommerceStore {
	
	private Courier courier;
	
	public EcommerceStore() {
		System.out.println("E-CommerceStore:: 0-param constructor");
	}
	
	public void setCourier(Courier courier) {
		this.courier=courier;
		System.out.println("E-CommerceStore.setCourier()");
	}
	
	public String shopping(String[] items,double[] prices) {
		double billAmt=0.0;
		for(double price:prices)
			billAmt+=price;
		String billMsg=Arrays.toString(items)+" with prices"+Arrays.toString(prices)+" Bill Amount:: "+billAmt;
		int oid=new Random().nextInt(1000);
		String deliverMsg = courier.deliverOrder(oid);
		return billMsg+"\n==="+deliverMsg;
	}
}
