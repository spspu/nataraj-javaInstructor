package com.mainapp;

import com.mainapp.dao.Dao;
import com.mainapp.factory.DaoFactory;
import com.mainapp.factory.DaoFactoryCreator;

public class Launch {
	
	public static void main(String[] args) {
		DaoFactory factory=DaoFactoryCreator.buildDaoFactory("DB");
		Dao stdDao=factory.createDao("student");
		Dao crsDao=factory.createDao("course");
		stdDao.insert();
		System.out.println(".......");
		crsDao.insert();
	}
}
