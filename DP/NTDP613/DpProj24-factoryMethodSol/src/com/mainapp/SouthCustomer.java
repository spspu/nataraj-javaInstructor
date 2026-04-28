package com.mainapp;

import com.mainapp.bike.BajajBike;
import com.mainapp.factory.ChennaiBajajFactory;
import com.mainapp.factory.method.BajajBikeFactory;

public class SouthCustomer {
	
	public static void main(String[] args) {
		BajajBikeFactory factory=new ChennaiBajajFactory();
		BajajBike bike = factory.orderBike("pulsor");
		bike.drive();
	}

}
