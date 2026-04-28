package com.mainapp.factory;

import com.mainapp.components.BlueDart;
import com.mainapp.components.Courier;
import com.mainapp.components.Dhl;
import com.mainapp.components.EcommerceStore;

public class EcommerceStoreFactory {
	
	public static EcommerceStore getInstance(String courierType) {
		Courier courier=null;
		if(courierType.equalsIgnoreCase("dhl"))
			courier=new Dhl();
		else if(courierType.equalsIgnoreCase("blueDart"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("Invalid Courier Type");
		
		EcommerceStore store=new EcommerceStore();
		store.setCourier(courier);
		return store;
	}
}
