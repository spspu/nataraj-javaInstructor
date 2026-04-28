package com.mainapp.decorator;

import com.mainapp.components.IceCream;
import com.mainapp.components.IceCreamDecorator;

public class DryFruitDecorator extends IceCreamDecorator{

	public DryFruitDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addDryFruits();
	}

	private void addDryFruits() {
		System.out.println("Adding dryfruits");
	}

}
