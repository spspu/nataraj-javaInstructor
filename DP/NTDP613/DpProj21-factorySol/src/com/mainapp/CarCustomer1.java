package com.mainapp;

import com.mainapp.components.Car;
import com.mainapp.factory.CarFactory;

public class CarCustomer1 {
	
	public static void main(String[] args) {
		Car bCar = CarFactory.createCar("budget");
		bCar.drive();
	}
}
