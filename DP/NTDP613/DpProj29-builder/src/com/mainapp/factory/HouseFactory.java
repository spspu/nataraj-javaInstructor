package com.mainapp.factory;

import com.mainapp.builder.ConcreteHouseBuilder;
import com.mainapp.builder.HouseBuilder;
import com.mainapp.builder.IglooHouseBuilder;
import com.mainapp.builder.MarbleHouseBuilder;
import com.mainapp.builder.WoodenHouseBuilder;
import com.mainapp.director.CivilEngineer;
import com.mainapp.product.House;

public interface HouseFactory {
	public static House getInstance(String type) {
		House house=new House();
		HouseBuilder builder=null;
		if(type.equalsIgnoreCase("wooden")) {
			  builder=new WoodenHouseBuilder(house)	;
			}
			else if(type.equalsIgnoreCase("ice")) {
				builder=new IglooHouseBuilder(house);
			}
			else if(type.equalsIgnoreCase("concrete")) {
				builder=new ConcreteHouseBuilder(house);
			}
			else if(type.equalsIgnoreCase("marble")) {
				builder=new MarbleHouseBuilder(house);
			}
			else 
				throw new IllegalArgumentException("Invalid House type");
		CivilEngineer engineer=new CivilEngineer(builder);
		house=engineer.buildHouse();
		return house;
	}
}
