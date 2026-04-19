package com.mainapp.service;

import com.mainapp.dao.UserDao;

public class UserMgmtServiceImpl implements UserMgmtService{
	
	private UserDao userDao;
	
	public UserMgmtServiceImpl(UserDao userDao) {
		this.userDao=userDao;
	}
	
	@Override
	public String findNameById(int id) {
		String name = userDao.searchNameById(id);
		return name;
	}

	@Override
	public boolean login(String user, String pwd) {
		if(user==null || user.equals("") || pwd==null || pwd.equals(""))
			throw new IllegalArgumentException("invalid inputs");
		boolean flag = userDao.authenticate(user, pwd);
		return flag;
	}

}
