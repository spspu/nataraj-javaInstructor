package com.mainapp.service;

import org.springframework.stereotype.Service;

import com.mainapp.entity.UserInfoEntity;

@Service
public class WishMessageServiceImpl implements WishMessageService{

	@Override
	public String sayHello() {
		
		return "Good Morning";
	}

	@Override
	public String registerUser(UserInfoEntity user) {
		
		return "nothing implement";
	}

}
