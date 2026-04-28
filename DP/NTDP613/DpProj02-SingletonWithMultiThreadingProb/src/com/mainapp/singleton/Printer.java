package com.mainapp.singleton;

//Singleton java class with minimum standards
public class Printer {
	
	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer:: 0-param constructor");
	}
	
	public static Printer getInstance() {
		if(INSTANCE == null) {
			INSTANCE=new Printer();
		}
		return INSTANCE;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}

}
