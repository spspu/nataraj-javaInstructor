package com.mainapp;

import com.mainapp.component.Car;
import com.mainapp.factory.CarFactory;
import com.mainapp.factory.CarType;

public class CarCustomer3 {
	
	public static void main(String[] args) {
		Car sCar = CarFactory.createCar(CarType.MODEL_SPORTS);
		sCar.drive();
	}
}
