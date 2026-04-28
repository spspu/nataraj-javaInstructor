package com.mainapp.factory;

import java.lang.reflect.Proxy;

import com.mainapp.proxy.BankServiceProxyHelper;
import com.mainapp.real.BankService;
import com.mainapp.real.BankServiceImpl;

public class BankServiceFactory {
	public static BankService getInsatnce(boolean RbiMonitoring) {
		BankService service=null;
		if(RbiMonitoring)
			service=(BankService) Proxy.newProxyInstance(BankService.class.getClassLoader(), new Class[] {BankService.class}, new BankServiceProxyHelper());
		else
			service=new BankServiceImpl();
		return service;
	}
}
