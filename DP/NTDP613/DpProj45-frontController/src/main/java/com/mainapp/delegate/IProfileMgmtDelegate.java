package com.mainapp.delegate;

import com.mainapp.dto.ProfileDetailsDTO;

public interface IProfileMgmtDelegate {
	public ProfileDetailsDTO fetchProfileById(int id)throws Exception;
}
