package com.mainapp;

import com.mainapp.bike.BajajBike;
import com.mainapp.factory.NagpurBajajFactory;

public class NorthCustomer {
	
	public static void main(String[] args) {
		BajajBike bike=NagpurBajajFactory.createBike("pulsor");
		bike.drive();
	}

}
