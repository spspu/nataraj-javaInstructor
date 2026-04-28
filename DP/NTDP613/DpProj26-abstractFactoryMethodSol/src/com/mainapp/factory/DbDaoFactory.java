package com.mainapp.factory;

import com.mainapp.dao.Dao;
import com.mainapp.dao.DbCourseDao;
import com.mainapp.dao.DbStudentDao;

public class DbDaoFactory implements DaoFactory{
	
	public Dao createDao(String type) {
		Dao dao=null;
		if(type.equalsIgnoreCase("student"))
			dao=new DbStudentDao();
		else if(type.equalsIgnoreCase("course"))
			dao=new DbCourseDao();
		else
			throw new IllegalArgumentException("Invalid Dao Type");
		return dao;
	}

}
