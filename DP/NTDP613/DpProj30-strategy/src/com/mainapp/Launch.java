package com.mainapp;

import com.mainapp.components.EcommerceStore;
import com.mainapp.factory.EcommerceStoreFactory;

public class Launch {
	
	public static void main(String[] args) {
		EcommerceStore store=EcommerceStoreFactory.getInstance("dhl");
		String resultMsg=store.shopping(new String[] {"shirt","hat"},new double[] {1500,100});
		System.out.println(resultMsg);
	}
}
