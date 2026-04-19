package com.mainapp.service;

public interface UserMgmtService {
	
	public String findNameById(int id);
	public boolean login(String user,String pwd);

}
