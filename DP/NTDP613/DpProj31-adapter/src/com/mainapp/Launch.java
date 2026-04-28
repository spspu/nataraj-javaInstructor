package com.mainapp;

import com.mainapp.service.AccuWeatherService;
import com.mainapp.service.AccuWeatherServiceImpl;

public class Launch {
	
	public static void main(String[] args) {
		AccuWeatherService service=new AccuWeatherServiceImpl();
		String result = service.showTemperature("hyderabad");
		System.out.println("Temperature:: "+result);
	}
}
