package com.mainapp.factory;

import com.mainapp.recruitment.HireDotNetFresher;
import com.mainapp.recruitment.HireFresher;
import com.mainapp.recruitment.HireJavaFresher;
import com.mainapp.recruitment.HireUiTechnologiesFresher;

public class HireFresherFactory {
	
	public static HireFresher getInstance(String type) {
		HireFresher fresher=null;
		if(type.equalsIgnoreCase("java"))
			fresher=new HireJavaFresher();
		else if(type.equalsIgnoreCase("dotNet"))
			fresher=new HireDotNetFresher();
		else if(type.equalsIgnoreCase("ui"))
			fresher=new HireUiTechnologiesFresher();
		else
			throw new IllegalArgumentException("invalid fresher type");
		return fresher;
	}

}
