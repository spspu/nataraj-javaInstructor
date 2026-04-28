package com.mainapp.singleton;

import com.mainapp.util.CommonUtils;

//Singleton java class with minimum standards
public class Printer extends CommonUtils{
	private static final long serialVersionUID = 1L;
	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer:: 0-param constructor");
	}
	
//	Using synchronized block with double Null check inside the static factory method
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

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException("in this singleton class is restricted");
	}
	
	public Object readResolve() {
		throw new IllegalArgumentException("Deserialization is not allowed on this class");
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}

