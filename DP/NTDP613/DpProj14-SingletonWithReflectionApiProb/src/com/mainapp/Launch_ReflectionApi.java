package com.mainapp;

import java.lang.reflect.Constructor;

import com.mainapp.singleton.Printer;

public class Launch_ReflectionApi {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.mainapp.singleton.Printer");

			Constructor<?> cons = c.getDeclaredConstructor();
			cons.setAccessible(true);

			Printer p1 = (Printer) cons.newInstance();
			Printer p2 = (Printer) cons.newInstance();

			Printer p = Printer.getInstance();

			System.out.println(p.hashCode()+" "+p1.hashCode()+" "+p2.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}