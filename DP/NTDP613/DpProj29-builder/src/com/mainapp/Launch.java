package com.mainapp;

import com.mainapp.factory.HouseFactory;
import com.mainapp.product.House;

public class Launch {
	public static void main(String[] args) {
		System.out.println("------------------");
		House house=HouseFactory.getInstance("wooden");
		System.out.println(house);
	}
}
