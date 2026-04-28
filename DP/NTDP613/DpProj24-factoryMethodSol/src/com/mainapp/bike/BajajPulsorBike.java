package com.mainapp.bike;

public class BajajPulsorBike implements BajajBike{
	
	private float price;

	@Override
	public void painting() {
		System.out.println("BajajPulsorBike.painting()");
	}

	@Override
	public void assembling() {
		System.out.println("BajajPulsorBike.asembling()");
	}

	@Override
	public void engineTest() {
		System.out.println("BajajPulsorBike.engineTest()");
	}

	@Override
	public void roadTest() {
		System.out.println("BajajPulsorBike.roadTest()");
	}

	@Override
	public void drive() {
		System.out.println("BajajPulsorBike.drive()");
	}

}
