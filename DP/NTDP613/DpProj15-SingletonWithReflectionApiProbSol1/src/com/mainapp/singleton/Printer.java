package com.mainapp.singleton;

import com.mainapp.util.CommonUtils;

//Singleton java class with minimum standards
public class Printer extends CommonUtils{
	private static final long serialVersionUID = 1L;
	private static Printer INSTANCE;
	private static boolean isInstantiated=false;
	
	private Printer() {
		if(isInstantiated)
			throw new RuntimeException("Object is already created");
		else
			isInstantiated=true;
		System.out.println("Printer:: 0-param constructor");
	}
	
//	Using synchronized block with double Null check inside the static factory method
	public static Printer getInstance() {
		if(INSTANCE == null) {
			synchronized(Printer.class) {
				if(INSTANCE == null) {
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
		return INSTANCE;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
}

