package com.mainapp;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.mainapp.singleton.Printer;

public class Launch_ClassLoader {
	public static void main(String[] args) {
		try {
			System.out.println("********* Using ApplcationClassLoader *********");
			Printer p=Printer.getInstance();
			System.out.println("class loader: "+p.getClass().getClassLoader());
			System.out.println("--------------------");
			System.out.println("======== Using URLClassLoader(readymade Custom ClassLoader) =========");
			URLClassLoader loader = new URLClassLoader(new URL[] {new URL("file:/C:/DpProj09.jar")},p.getClass().getClassLoader());
			Class<?> clazz=loader.loadClass("com.mainapp.singleton.Printer");
			Method method=clazz.getMethod("getInstance", new Class[] {});
			Object obj=method.invoke(null);
			System.out.println("object has hash codes:: "+obj.hashCode()+" "+p.hashCode());
			loader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
