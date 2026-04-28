package com.mainapp.decorator;

import com.mainapp.components.IceCream;
import com.mainapp.components.IceCreamDecorator;

public class ChocoChipsDecorator extends IceCreamDecorator{

	public ChocoChipsDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addChocoChips();
	}

	private void addChocoChips() {
		System.out.println("Adding Chocochips");
	}

}
