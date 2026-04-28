package com.mainapp.builder;

import com.mainapp.product.House;
import com.mainapp.product.IceBasement;
import com.mainapp.product.IceCurvingInterior;
import com.mainapp.product.IceRoof;
import com.mainapp.product.IceStructure;

public class IglooHouseBuilder implements HouseBuilder{
	
private House house;
	
	public IglooHouseBuilder(House house) {
		System.out.println("IglooHouseBuilder:: 1-param constructor");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new IceRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new IceBasement());
	}

	@Override
	public void constructStructure() {
		house.setStructure(new IceStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new IceCurvingInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
