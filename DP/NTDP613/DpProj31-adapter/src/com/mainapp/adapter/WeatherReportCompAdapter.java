package com.mainapp.adapter;

import com.mainapp.external.WeatherReportComp;
import com.mainapp.external.WeatherReportCompImpl;

public class WeatherReportCompAdapter {
	
	public String fetchTemperature(String cityName) {
		int cityCode=0;
		if(cityName.equalsIgnoreCase("hyderabad"))
			cityCode=1100;
		else if(cityName.equalsIgnoreCase("bangulore"))
			cityCode=1103;
		else if(cityName.equalsIgnoreCase("delhi"))
			cityCode=1101;
		else
			return "city not found in list";
		WeatherReportComp comp=new WeatherReportCompImpl();
		float tempf = comp.getTemperature(cityCode);
		float tempc=5/9.0f*(tempf-32.0f);
		return tempc+"celsius degrees";
	}
}
