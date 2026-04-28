package com.mainapp.external;

import java.util.Random;

public class WeatherReportCompImpl implements WeatherReportComp{

	@Override
	public float getTemperature(int cityCode) {
		if(cityCode==1100)
			return new Random().nextFloat()*100.0f;
		else if(cityCode==1101)
			return new Random().nextFloat()*100.0f;
		else if(cityCode==1102)
			return new Random().nextFloat()*100.0f;
		else
			throw new IllegalArgumentException("Invalid City Code");
	}
}
