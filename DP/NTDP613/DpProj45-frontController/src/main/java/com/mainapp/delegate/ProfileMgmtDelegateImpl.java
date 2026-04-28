package com.mainapp.delegate;

import com.mainapp.bo.ProfileDetailsBO;
import com.mainapp.dao.IProfileDAO;
import com.mainapp.dao.ProfileDAOImpl;
import com.mainapp.dto.ProfileDetailsDTO;

public class ProfileMgmtDelegateImpl implements IProfileMgmtDelegate {
    private IProfileDAO dao;
	
	public ProfileMgmtDelegateImpl() {
		dao=new ProfileDAOImpl();
	}
	
	@Override
	public ProfileDetailsDTO fetchProfileById(int id)throws Exception {
		//use DAO
		ProfileDetailsBO bo=dao.getProfileById(id);
		//convert  BO class object to DTO class object
		ProfileDetailsDTO dto=new ProfileDetailsDTO();
		dto.setProfileId(bo.getProfileId());
		dto.setProfileName(bo.getProfileName());
		dto.setProfileUrl(bo.getProfileUrl());
		dto.setDOB(bo.getDOB());
		dto.setDOJ(bo.getDOJ());
		return dto;
	}

}