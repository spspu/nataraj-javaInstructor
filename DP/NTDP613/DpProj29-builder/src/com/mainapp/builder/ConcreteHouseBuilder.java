package com.mainapp.builder;

import com.mainapp.product.ConcreteBasement;
import com.mainapp.product.ConcreteRoof;
import com.mainapp.product.ConcreteStructure;
import com.mainapp.product.GlassInterior;
import com.mainapp.product.House;

public class ConcreteHouseBuilder implements HouseBuilder {

	private House house;
	
	public ConcreteHouseBuilder(House house) {
		System.out.println("ConcreteHouseBuilder:: 1-param constructor");
		house=new House();
	}

	@Override
	public void constructBasement() {
		System.out.println("ConcreteHouseBuilder.buildBasement()");
		house.setBasement(new ConcreteBasement());
	}

	@Override
	public void constructRoof() {
		System.out.println("ConcreteHouseBuilder.buildRoofing()");
		house.setRoof(new ConcreteRoof());
	}

	@Override
	public void constructStructure() {
		System.out.println("ConcreteHouseBuilder.buildStructure()");
		house.setStructure(new ConcreteStructure());
	}

	@Override
	public void constructInterior() {
		System.out.println("ConcreteHouseBuilder.builInterior()");
		house.setInterior(new GlassInterior());
	}

	@Override
	public House getHouse() {
		System.out.println("ConcreteHouseBuilder.createHouse()");
		return house;
	}

}
