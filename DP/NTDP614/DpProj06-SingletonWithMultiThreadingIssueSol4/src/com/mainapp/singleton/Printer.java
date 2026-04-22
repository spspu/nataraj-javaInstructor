package com.mainapp.singleton;

//Singleton java class with minimum standards
public class Printer {
	private static Printer INSTANCE=new Printer();
	
	private Printer() {
		System.out.println("Printer:: 0-param constructor");
	}
	
//	Sol4:: Using eager instantiation
	public static Printer getInstance() {
		
		return INSTANCE;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}

