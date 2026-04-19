package com.mainapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mainapp.entity.UserInfoEntity;
import com.mainapp.service.WishMessageService;

//1st run as rest-controller
//then run as j-unit test
@RestController
@RequestMapping("/wish-api")
public class WishMessageOperationsController {
	
	@Autowired
	private WishMessageService service;
	
	@GetMapping("/wish")
	public ResponseEntity<String> showMessage(){
		String msg=service.sayHello();
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody UserInfoEntity user){
		String msg = service.registerUser(user);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	
	

}
