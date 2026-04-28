package com.mainapp.factory;

import com.mainapp.bike.BajajBike;
import com.mainapp.bike.BajajDiscoverBike;
import com.mainapp.bike.BajajPlatinaBike;
import com.mainapp.bike.BajajPulsorBike;
import com.mainapp.factory.method.BajajBikeFactory;

public class ChennaiBajajFactory extends BajajBikeFactory{
	
	public BajajBike createBike(String type) {
		BajajBike bike=null;
		if(type.equalsIgnoreCase("pulsor"))
			bike=new BajajPulsorBike();
		else if(type.equalsIgnoreCase("discover"))
			bike=new BajajDiscoverBike();
		else if(type.equalsIgnoreCase("platina"))
			bike=new BajajPlatinaBike();
		else
			throw new IllegalArgumentException("Invalid Bike type");
		bike.assembling();
		bike.painting();
		bike.engineTest();
		return bike;
	}

	@Override
	public void painting() {
		System.out.println("ChennaiBajajFactory.painting()");
	}

	@Override
	public void assembling() {
		System.out.println("ChennaiBajajFactory.assembling()");
	}

	@Override
	public void engineTest() {
		System.out.println("ChennaiBajajFactory.engineTest()");
	}

	@Override
	public void roadTest() {
		System.out.println("ChennaiBajajFactory.roadTest()");
	}


}
