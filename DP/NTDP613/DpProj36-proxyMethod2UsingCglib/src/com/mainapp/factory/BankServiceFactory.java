package com.mainapp.factory;

import com.mainapp.proxy.BankServiceProxyHelper;
import com.mainapp.real.BankServiceImpl;

import net.sf.cglib.proxy.Enhancer;

public class BankServiceFactory {
	public static BankServiceImpl getInsatnce(boolean RbiMonitoring) {
		BankServiceImpl service=null;
		if(RbiMonitoring)
			service=(BankServiceImpl) Enhancer.create(BankServiceImpl.class, new BankServiceProxyHelper());
		else
			service=new BankServiceImpl();
		return service;
	}
}
