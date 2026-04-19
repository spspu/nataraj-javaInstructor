package com.mainapp.service;

import jakarta.mail.MessagingException;

public interface PurchaseOrderService {
	
	public String shopping(String[]items,float[]prices,String[]emails) throws MessagingException;

}
