package com.mainapp.factory;

import com.mainapp.component.BudgetCar;
import com.mainapp.component.Car;
import com.mainapp.component.LuxoryCar;
import com.mainapp.component.SportsCar;

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
