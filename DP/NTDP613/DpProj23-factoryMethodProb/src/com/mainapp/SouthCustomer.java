package com.mainapp;

import com.mainapp.bike.BajajBike;
import com.mainapp.factory.ChennaiBajajFactory;

public class SouthCustomer {
	
	public static void main(String[] args) {
		BajajBike bike=ChennaiBajajFactory.createBike("pulsor");
		bike.drive();
	}

}
