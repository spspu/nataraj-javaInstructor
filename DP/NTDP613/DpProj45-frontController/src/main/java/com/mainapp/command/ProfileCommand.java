package com.mainapp.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mainapp.delegate.IProfileMgmtDelegate;
import com.mainapp.delegate.ProfileMgmtDelegateImpl;
import com.mainapp.dto.ProfileDetailsDTO;

public class ProfileCommand implements ICommand {
	 private IProfileMgmtDelegate  delegate;
	 
	public ProfileCommand() {
		delegate=new ProfileMgmtDelegateImpl();
	}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//use  BusinessDelegate
		ProfileDetailsDTO dto=delegate.fetchProfileById(Integer.parseInt(req.getParameter("id")));
		//keep results in request scope
		req.setAttribute("profileDTO",dto);
		//return  Logical View name
		return "show_profile";
	}

}