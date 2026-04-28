package com.mainapp.product;

public class ConcreteBasement implements Basement{
	
	public ConcreteBasement() {
		System.out.println("ConcreteBasement:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "ConcreteBasement []";
	}

}
