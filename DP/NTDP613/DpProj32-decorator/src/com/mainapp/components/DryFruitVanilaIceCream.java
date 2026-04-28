package com.mainapp.components;

public class DryFruitVanilaIceCream extends VanilaIceCream{
	@Override
	public void prepare() {
		System.out.println("prepare Vanila-IceCream");
		addDryFruits();
	}
	private void addDryFruits() {
		System.out.println("Adding DryFruits....");
	}
}
