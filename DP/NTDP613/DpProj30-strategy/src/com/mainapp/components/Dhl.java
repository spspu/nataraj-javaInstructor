package com.mainapp.components;

public final class Dhl implements Courier{
	public Dhl() {
		System.out.println("DHL: 0-param constructor");
	}
	@Override
	public String deliverOrder(int oid) {
		return oid+" order id order products are delivered by DHL Courier Service";
	}

}
