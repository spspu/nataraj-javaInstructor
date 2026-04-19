package com.mainapp.dao;

public interface UserDao {
	
	public String searchNameById(int id);
	public boolean authenticate(String user,String pwd);

}
