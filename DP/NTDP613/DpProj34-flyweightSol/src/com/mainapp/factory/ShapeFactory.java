package com.mainapp.factory;

import java.util.HashMap;
import java.util.Map;

import com.mainapp.components.Circle;
import com.mainapp.components.Shape;
import com.mainapp.components.Square;

//with Generic
/*
public class ShapeFactory<T extends Shape> {
	private static Map<String,Shape> cacheMap=new HashMap<>();
	
	public static <T extends Shape> T getInstance(String type,Class<T> clazz) throws Exception{
		if(!cacheMap.containsKey(type)) {
			cacheMap.put(type, cacheMap.put(type, (T) clazz.getDeclaredConstructors()[0].newInstance(null)));
		}
		return (T) cacheMap.get(type);
	}

}
*/
//without Generic
public class ShapeFactory{
	private static Map<String,Shape> cacheMap=new HashMap();
	
	public static Shape getInstance(String type) {
		Shape shape=null;
		if(!cacheMap.containsKey(type)) {
			if(type.equalsIgnoreCase("circle"))
				shape=new Circle();
			else if(type.equalsIgnoreCase("square"))
				shape=new Square();
			else
				throw new IllegalArgumentException("invalid shape type");
		}
		return cacheMap.get(type);
	}
}