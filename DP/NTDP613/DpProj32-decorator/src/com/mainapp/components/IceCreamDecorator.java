package com.mainapp.components;

public abstract class IceCreamDecorator implements IceCream{
	
	private IceCream iceCream;
	
	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream=iceCream;
	}
	
	@Override
	public void prepare() {
		iceCream.prepare();
	}

}
