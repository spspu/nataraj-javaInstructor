package com.mainapp.factory;

import com.mainapp.dao.Dao;

public interface DaoFactory {
	
	public Dao createDao(String type);

}
