package com.mainapp;

import com.mainapp.components.Car;
import com.mainapp.factory.CarFactory;

public class CarCustomer2 {
	
	public static void main(String[] args) {
		Car lCar = CarFactory.createCar("luxory");
		lCar.drive();
	}
}
