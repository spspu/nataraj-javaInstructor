package com.mainapp.decorator;

import com.mainapp.components.IceCream;
import com.mainapp.components.IceCreamDecorator;

public class HoneyDecorator extends IceCreamDecorator{

	public HoneyDecorator(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}

	private void addHoney() {
		System.out.println("Adding Honey");
	}

}
