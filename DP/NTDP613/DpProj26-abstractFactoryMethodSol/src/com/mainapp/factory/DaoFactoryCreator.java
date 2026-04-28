package com.mainapp.factory;

public class DaoFactoryCreator {
	
	public static DaoFactory buildDaoFactory(String type) {
		DaoFactory factory=null;
		if(type.equalsIgnoreCase("DB"))
			factory=new DbDaoFactory();
		else if(type.equalsIgnoreCase("Excel"))
			factory=new ExcelDaoFactory();
		else
			throw new IllegalArgumentException("Invalid Factory Type");
		return factory;
	}

}
