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
	
//	Sol3:: Using synchronized block with double Null check inside the static factory method
	public static Printer getInstance() {
		
		if(INSTANCE == null) {
			System.out.println("Printer.getInstance()-outside sync block:: "+Thread.currentThread().getName());
			synchronized(Printer.class) {
				System.out.println("Printer.getInstance()-inside sync block:: "+Thread.currentThread().getName());
				if(INSTANCE == null) {
					try {
						Thread.sleep(10000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					INSTANCE=new Printer();
				}
			}
		}
		return INSTANCE;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}

