package com.mainapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mainapp.singleton.Printer;

public class Launch_DeSerializaiton {
	
	public static void doSerialization(Printer printer) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data.ser"))) {
			oos.writeObject(printer);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Object Serialization is done");
	}
	
	public static Printer doDeserialization() {
		Printer p=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.ser"))) {
			p=(Printer) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	
	public static void main(String[] args) {
		Printer p1=Printer.getInstance();
		//perform serialization
//		doSerialization(p1);
		System.out.println("****************************");
		Printer p2=doDeserialization();
		Printer p3=doDeserialization();
		System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());
	}
}
