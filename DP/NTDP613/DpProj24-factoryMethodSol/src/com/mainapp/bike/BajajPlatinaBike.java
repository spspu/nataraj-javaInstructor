package com.mainapp.bike;

public class BajajPlatinaBike implements BajajBike{
	
	private float price;

	@Override
	public void painting() {
		System.out.println("BajajPlatinaBike.painting()");
	}

	@Override
	public void assembling() {
		System.out.println("BajajPlatinaBike.asembling()");
	}

	@Override
	public void engineTest() {
		System.out.println("BajajPlatinaBike.engineTest()");
	}

	@Override
	public void roadTest() {
		System.out.println("BajajPlatinaBike.roadTest()");
		
	}

	@Override
	public void drive() {
		System.out.println("BajajPlatinaBike.drive()");
		
	}

}
