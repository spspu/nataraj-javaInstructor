package com.mainapp;

import com.mainapp.components.Car;
import com.mainapp.factory.CarFactory;

public class CarCustomer3 {
	
	public static void main(String[] args) {
		Car sCar = CarFactory.createCar("sports");
		sCar.drive();
	}
}
