package com.mainapp.singleton;

//enum
public enum Printer{
	
	INSTANCE;
	
	public static Printer getInstance() {
		return INSTANCE;
	}
	
	public void print(String msg) {
		System.out.println("printing "+msg+"....");
	}
}

