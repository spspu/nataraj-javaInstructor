package com.mainapp.builder;

import com.mainapp.product.House;
import com.mainapp.product.WoodenBasement;
import com.mainapp.product.WoodenInterior;
import com.mainapp.product.WoodenRoof;
import com.mainapp.product.WoodenStructure;

public class WoodenHouseBuilder implements HouseBuilder{
	
	private House house;
	
	public WoodenHouseBuilder(House house) {
		System.out.println("WoodenHouseBuilder:: 1-param constructor");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new WoodenRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new WoodenBasement());
	}

	@Override
	public void constructStructure() {
		house.setStructure(new WoodenStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new WoodenInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}
}
