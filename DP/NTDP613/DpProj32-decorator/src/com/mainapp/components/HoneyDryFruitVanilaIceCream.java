package com.mainapp.components;

public class HoneyDryFruitVanilaIceCream extends DryFruitVanilaIceCream{
	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}
	private void addHoney() {
		System.out.println("Adding Honey......");
	}
}
