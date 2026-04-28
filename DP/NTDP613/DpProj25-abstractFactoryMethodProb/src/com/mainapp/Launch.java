package com.mainapp;

import com.mainapp.dao.Dao;
import com.mainapp.factory.DbDaoFactory;
import com.mainapp.factory.ExcelDaoFactory;

public class Launch {
	
	public static void main(String[] args) {
		Dao stdDao=DbDaoFactory.createDao("student");
		Dao crsDao=ExcelDaoFactory.createDao("course");
		stdDao.insert();
		System.out.println(".......");
		crsDao.insert();
	}

}
