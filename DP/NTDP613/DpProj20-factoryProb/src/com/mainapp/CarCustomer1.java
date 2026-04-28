package com.mainapp;

import com.mainapp.components.BudgetCar;
import com.mainapp.components.Car;

public class CarCustomer1 {
	
	public static void main(String[] args) {
		Car bCar = new BudgetCar();
		bCar.assemble();
		bCar.roadTest();
		bCar.drive();
	}
}
