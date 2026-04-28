package com.mainapp;

import com.mainapp.bike.BajajBike;
import com.mainapp.factory.NagpurBajajFactory;
import com.mainapp.factory.method.BajajBikeFactory;

public class NorthCustomer {
	
	public static void main(String[] args) {
		BajajBikeFactory factory=new NagpurBajajFactory();
		BajajBike bike = factory.orderBike("discover");
		bike.drive();
	}

}
