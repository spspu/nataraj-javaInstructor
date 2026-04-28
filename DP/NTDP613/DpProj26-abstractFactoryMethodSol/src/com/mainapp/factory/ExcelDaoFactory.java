package com.mainapp.factory;

import com.mainapp.dao.Dao;
import com.mainapp.dao.ExcelCourseDao;
import com.mainapp.dao.ExcelStudentDao;

public class ExcelDaoFactory implements DaoFactory{
	
	public Dao createDao(String type) {
		Dao dao=null;
		if(type.equalsIgnoreCase("student"))
			dao=new ExcelStudentDao();
		else if(type.equalsIgnoreCase("course"))
			dao=new ExcelCourseDao();
		else
			throw new IllegalArgumentException("Invalid Dao Type");
		return dao;
	}

}
