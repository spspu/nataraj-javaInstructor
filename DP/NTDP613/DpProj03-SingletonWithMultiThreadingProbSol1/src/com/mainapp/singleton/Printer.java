package com.mainapp.singleton;

//Singleton java class with minimum standards
public class Printer {
	
	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer:: 0-param constructor");
	}
	/*
	public static Printer getInstance() {
		if(INSTANCE == null) {
			INSTANCE=new Printer();
		}
		return INSTANCE;
	}
	*/
	
//	Sol1:: Using synchronized static factory method
	public synchronized static Printer getInstance() {
		if(INSTANCE == null) {
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			INSTANCE=new Printer();
		}
		return INSTANCE;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}
