package com.mainapp;

import com.mainapp.component.Car;
import com.mainapp.factory.CarFactory;
import com.mainapp.factory.CarType;

public class CarCustomer1 {
	
	public static void main(String[] args) {
		Car bCar = CarFactory.createCar(CarType.MODEL_BUDGET);
		bCar.drive();
	}
}
