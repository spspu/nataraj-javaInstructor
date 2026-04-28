package com.mainapp.dao;

public class DbStudentDao implements Dao{

	@Override
	public void insert() {
		System.out.println("DbStudentDao.insert():: Inserting student details to Db");
	}

}
