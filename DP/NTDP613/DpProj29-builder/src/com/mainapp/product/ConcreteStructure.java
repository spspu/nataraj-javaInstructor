package com.mainapp.product;

public class ConcreteStructure implements Structure{
	
	public ConcreteStructure() {
		System.out.println("ConcreteStructor:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "ConcreteStructor []";
	}

}
