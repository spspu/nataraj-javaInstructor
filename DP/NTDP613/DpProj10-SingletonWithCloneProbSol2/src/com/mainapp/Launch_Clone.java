package com.mainapp;

import com.mainapp.singleton.Printer;

public class Launch_Clone {
	
	public static void main(String[] args) {
		Printer p1=Printer.getInstance();
		try {
			Printer p2=(Printer)p1.clone();
			System.out.println(p1.hashCode()+" "+p2.hashCode());
			System.out.println("p1==p2"+(p1==p2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
