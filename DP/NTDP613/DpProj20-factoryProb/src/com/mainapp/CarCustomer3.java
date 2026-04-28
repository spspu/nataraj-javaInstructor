package com.mainapp;

import com.mainapp.components.Car;
import com.mainapp.components.SportsCar;

public class CarCustomer3 {
	
	public static void main(String[] args) {
		Car sCar = new SportsCar();
		sCar.assemble();
		sCar.roadTest();
		sCar.drive();
	}
}
