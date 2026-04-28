package com.mainapp.product;

public class ConcreteRoof implements Roof{
	
	public ConcreteRoof() {
		System.out.println("ConcreteRoof:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "ConcreteRoof []";
	}

}
