package com.mainapp;

import com.mainapp.components.Car;
import com.mainapp.components.LuxoryCar;

public class CarCustomer2 {
	
	public static void main(String[] args) {
		Car lCar = new LuxoryCar();
		lCar.assemble();
		lCar.roadTest();
		lCar.drive();
	}
}
