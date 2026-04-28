package com.mainapp.builder;

import com.mainapp.product.ConcreteBasement;
import com.mainapp.product.ConcreteRoof;
import com.mainapp.product.House;
import com.mainapp.product.IronStructure;
import com.mainapp.product.MixedInterior;

public class MarbleHouseBuilder implements HouseBuilder {

private House house;
	
	public MarbleHouseBuilder(House house) {
		System.out.println("MarbleHouseBuilder:: 1-param constructor()");
		this.house = house;
	}

	@Override
	public void constructRoof() {
		house.setRoof(new ConcreteRoof());
	}

	@Override
	public void constructBasement() {
		house.setBasement(new ConcreteBasement());
	}

	@Override
	public void constructStructure() {
		house.setStructure(new IronStructure());
	}

	@Override
	public void constructInterior() {
		house.setInterior(new MixedInterior());
	}

	@Override
	public House getHouse() {
		return house;
	}

}
