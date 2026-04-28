package com.mainapp.singleton;

//Singleton java class with minimum standards
public class Printer {
	
	private Printer() {
		System.out.println("Printer:: 0-param constructor");
	}
	
	private static class PrinterInner{
		private static Printer INSTANCE=new Printer();	//lazy instantiation
	}
	
//	Sol5:: Using inner class based Lazy instantiation
	public static Printer getInstance() {
		
		return PrinterInner.INSTANCE;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}

