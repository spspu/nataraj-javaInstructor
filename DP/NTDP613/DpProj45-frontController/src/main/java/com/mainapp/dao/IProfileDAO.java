package com.mainapp.dao;

import com.mainapp.bo.ProfileDetailsBO;

public interface IProfileDAO {
	public ProfileDetailsBO getProfileById(int id) throws Exception;
}
