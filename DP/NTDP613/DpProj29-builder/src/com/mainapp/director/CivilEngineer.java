package com.mainapp.director;

import com.mainapp.builder.HouseBuilder;
import com.mainapp.product.House;

public class CivilEngineer {
	private HouseBuilder builder;
	public CivilEngineer(HouseBuilder builder) {
		System.out.println("CivilEngineer: 1-param constructor");
		this.builder=builder;
	}
	public   House  buildHouse() {
		builder.constructBasement();
		builder.constructStructure();
		builder.constructRoof();
		builder.constructInterior();
		House house=builder.getHouse(); 
		return house;
	}
}					
