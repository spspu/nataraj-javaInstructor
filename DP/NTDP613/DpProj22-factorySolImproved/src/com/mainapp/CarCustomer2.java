package com.mainapp;

import com.mainapp.component.Car;
import com.mainapp.factory.CarFactory;
import com.mainapp.factory.CarType;

public class CarCustomer2 {
	
	public static void main(String[] args) {
		Car lCar = CarFactory.createCar(CarType.MODEL_LUXORY);
		lCar.drive();
	}
}
