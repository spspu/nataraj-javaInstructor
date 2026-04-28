package com.mainapp.factory;

import com.mainapp.bike.BajajBike;
import com.mainapp.bike.BajajDiscoverBike;
import com.mainapp.bike.BajajPlatinaBike;
import com.mainapp.bike.BajajPulsorBike;

public class NagpurBajajFactory {
	
	public static BajajBike createBike(String type) {
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

}
