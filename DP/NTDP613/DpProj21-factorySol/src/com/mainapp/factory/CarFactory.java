package com.mainapp.factory;

import com.mainapp.components.BudgetCar;
import com.mainapp.components.Car;
import com.mainapp.components.LuxoryCar;
import com.mainapp.components.SportsCar;

public class CarFactory {
	
	public static Car createCar(String type) {
		Car car=null;
		if(type.equalsIgnoreCase("budget"))
			car=new BudgetCar();
		else if(type.equalsIgnoreCase("luxory"))
			car=new LuxoryCar();
		else if(type.equalsIgnoreCase("sports"))
			car=new SportsCar();
		else
			throw new IllegalArgumentException("Invalid Car type");
		car.assemble();
		car.roadTest();
		return car;
	}

}
