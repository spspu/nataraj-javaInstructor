package com.mainapp.builder;

import com.mainapp.product.House;

public interface HouseBuilder {
	public void constructRoof();
	public void constructBasement();
	public void constructStructure();
	public void constructInterior();
	public House getHouse();
}
