package com.mainapp.factory;

import com.mainapp.proxy.BankServiceProxy;
import com.mainapp.real.BankService;
import com.mainapp.real.BankServiceImpl;

public class BankServiceFactory {
	public static BankService getInsatnce(boolean RbiMonitoring) {
		BankService service=null;
		if(RbiMonitoring)
			service=new BankServiceProxy();
		else
			service=new BankServiceImpl();
		return service;
	}
}
