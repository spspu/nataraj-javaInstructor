package com.mainapp.service;

import com.mainapp.adapter.WeatherReportCompAdapter;

public class AccuWeatherServiceImpl implements AccuWeatherService{

	@Override
	public String showTemperature(String cityName) {
		WeatherReportCompAdapter adapter=new WeatherReportCompAdapter();
		String tempc=adapter.fetchTemperature(cityName);
		return tempc;
	}

}
